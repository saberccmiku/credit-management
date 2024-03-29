/**
 * 分页加载
 * 使用方法写一个元素标签
 * 然后引用该js实现参数
 *
 *         $('#id').extendPagination({

            totalCount: 10,
            showCount: 10,
            limit: 10
            refreshUrl:""
        });
 */
(function ($) {
    $.fn.extendPagination = function (options) {
        var defaults = {
            //pageId:'',
            totalCount: '',
            showPage: '10',
            limit: '5',
            refreshUrl:"#",
            callback: function (curr, limit, totalCount) {
                // 装载局部刷新返回的页面
                $('#table_refresh').load(defaults.refreshUrl+"?page="+curr+"&limit="+limit,function () {
                    reloadWidget();
                });
                return false;
            },
            reloadWidget:function () {//加载其他函数

            }
        };
        $.extend(defaults, options || {});
        if (defaults.totalCount == '') {
            //alert('总数不能为空!');
            $(this).empty();
            return false;
        } else if (Number(defaults.totalCount) <= 0) {
            //alert('总数要大于0!');
            $(this).empty();
            return false;
        }
        if (defaults.showPage == '') {
            defaults.showPage = '10';
        } else if (Number(defaults.showPage) <= 0)defaults.showPage = '10';
        if (defaults.limit == '') {
            defaults.limit = '5';
        } else if (Number(defaults.limit) <= 0)defaults.limit = '5';

        initView($(this));

        function initView(elementObj) {
            var totalCount = Number(defaults.totalCount), showPage = Number(defaults.showPage),
                limit = Number(defaults.limit), totalPage = Math.ceil(totalCount / limit);
            if (totalPage > 0) {
                var html = [];
                html.push(' <ul class="pagination">');
                html.push(' <span class="pagination-nav" id="total">共'+defaults.totalCount+'条数据</span>');
                html.push(' <li class="previous"><a href="#">&laquo;</a></li>');
                html.push('<li class="disabled hidden"><a href="#">...</a></li>');
                if (totalPage <= showPage) {
                    for (var i = 1; i <= totalPage; i++) {
                        if (i == 1) html.push(' <li class="active"><a href="#">' + i + '</a></li>');
                        else html.push(' <li><a href="#">' + i + '</a></li>');
                    }
                } else {
                    for (var j = 1; j <= showPage; j++) {
                        if (j == 1) html.push(' <li class="active"><a href="#">' + j + '</a></li>');
                        else html.push(' <li><a href="#">' + j + '</a></li>');
                    }
                }
                html.push('<li class="disabled hidden"><a href="#">...</a></li>');
                html.push('<li class="next"><a href="#">&raquo;</a></li>');
                html.push('<li class="ml-2"><select id="pagination" class="custom-select" style="height: 2.5em"><option selected value="10">10 条/页</option> <option value="20">20 条/页</option> <option value="30">30 条/页</option></select></li>');
                html.push('<span class="pagination-nav">跳至</span>');
                html.push('<li><input id="toPage" type="email" style="width: 3.5em" class="form-control form-control-sm" id="pageNum" aria-describedby="pageNum" placeholder=""></li>');
                html.push('<span class="pagination-nav">页</span></ul>');
                elementObj.html(html.join(''));
                if (totalPage > showPage) elementObj.find('ul.pagination li.next').prev().removeClass('hidden');

                var pageObj = elementObj.find('ul.pagination'), preObj = pageObj.find('li.previous'),
                    currentObj = pageObj.find('li').not('.previous,.disabled,.next'),
                    nextObj = pageObj.find('li.next');

                function loopPageElement(minPage, maxPage) {
                    var tempObj = preObj.next();
                    for (var i = minPage; i <= maxPage; i++) {
                        if (minPage == 1 && (preObj.next().attr('class').indexOf('hidden')) < 0)
                            preObj.next().addClass('hidden');
                        else if (minPage > 1 && (preObj.next().attr('class').indexOf('hidden')) > 0)
                            preObj.next().removeClass('hidden');
                        if (maxPage == totalPage && (nextObj.prev().attr('class').indexOf('hidden')) < 0)
                            nextObj.prev().addClass('hidden');
                        else if (maxPage < totalPage && (nextObj.prev().attr('class').indexOf('hidden')) > 0)
                            nextObj.prev().removeClass('hidden');
                        var obj = tempObj.next().find('a');
                        if (!isNaN(obj.html()))obj.html(i);
                        tempObj = tempObj.next();
                    }
                }

                function callBack(curr) {
                    defaults.callback(curr, defaults.limit, totalCount);
                }
                currentObj.click(function (event) {
                    event.preventDefault();
                    var currPage = Number($(this).find('a').html()), activeObj = pageObj.find('li[class="active"]'),
                        activePage = Number(activeObj.find('a').html());
                    if (currPage == activePage) return false;
                    if (totalPage > showPage && currPage > 1)  {
                        var maxPage = currPage, minPage = 1;
                        if (($(this).prev().attr('class'))
                            && ($(this).prev().attr('class').indexOf('disabled')) >= 0) {
                            minPage = currPage - 1;
                            maxPage = minPage + showPage - 1;
                            loopPageElement(minPage, maxPage);
                        } else if (($(this).next().attr('class'))
                            && ($(this).next().attr('class').indexOf('disabled')) >= 0) {
                            if (totalPage - currPage >= 1) maxPage = currPage + 1;
                            else  maxPage = totalPage;
                            if (maxPage - showPage > 0) minPage = (maxPage - showPage) + 1;
                            loopPageElement(minPage, maxPage)
                        }
                    }
                    activeObj.removeClass('active');
                    $.each(currentObj, function (index, thiz) {
                        if ($(thiz).find('a').html() == currPage) {
                            $(thiz).addClass('active');
                            callBack(currPage);
                        }
                    });
                });
                preObj.click(function (event) {
                    event.preventDefault();
                    var activeObj = pageObj.find('li[class="active"]'), activePage = Number(activeObj.find('a').html());
                    if (activePage <= 1) return false;
                    if (totalPage > showPage) {
                        var maxPage = activePage, minPage = 1;
                        if ((activeObj.prev().prev().attr('class'))
                            && (activeObj.prev().prev().attr('class').indexOf('disabled')) >= 0) {
                            minPage = activePage - 1;
                            if (minPage > 1) minPage = minPage - 1;
                            maxPage = minPage + showPage - 1;
                            loopPageElement(minPage, maxPage);
                        }
                    }
                    $.each(currentObj, function (index, thiz) {
                        if ($(thiz).find('a').html() == (activePage - 1)) {
                            activeObj.removeClass('active');
                            $(thiz).addClass('active');
                            callBack(activePage - 1);
                        }
                    });
                });
                nextObj.click(function (event) {
                    event.preventDefault();
                    var activeObj = pageObj.find('li[class="active"]'), activePage = Number(activeObj.find('a').html());
                    if (activePage >= totalPage) return false;
                    if (totalPage > showPage) {
                        var maxPage = activePage, minPage = 1;
                        if ((activeObj.next().next().attr('class'))
                            && (activeObj.next().next().attr('class').indexOf('disabled')) >= 0) {
                            maxPage = activePage + 2;
                            if (maxPage > totalPage) maxPage = totalPage;
                            minPage = maxPage - showPage + 1;
                            loopPageElement(minPage, maxPage);
                        }
                    }
                    $.each(currentObj, function (index, thiz) {
                        if ($(thiz).find('a').html() == (activePage + 1)) {
                            activeObj.removeClass('active');
                            $(thiz).addClass('active');
                            callBack(activePage + 1);
                        }
                    });
                });
            }
        }


       function reloadWidget(){
            defaults.reloadWidget();
        }


        //pagination触发事件
        var  elementObj = $(this);
        $('#pagination').change(function () {
            let limit = this.value;
            defaults.limit=limit;
            // 装载局部刷新返回的页面
            $('#table_refresh').load(defaults.refreshUrl+"?page=1&limit="+limit,function () {
                reloadWidget();
                initView(elementObj.empty());
            });
        });


        //回车搜索
        $('#toPage').bind('keydown', function (event) {
            var event = window.event || arguments.callee.caller.arguments[0];
            if (event.keyCode === 13){
                let toPage = $('#toPage').val()
                // 装载局部刷新返回的页面
                $('#table_refresh').load(defaults.refreshUrl+"?page="+toPage+"&limit="+defaults.limit,function () {
                    reloadWidget();
                });
            }
        });
    };
})(jQuery);
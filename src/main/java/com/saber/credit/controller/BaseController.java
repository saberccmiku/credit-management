package com.saber.credit.controller;

import com.saber.credit.entities.Enumerate;
import com.saber.credit.entities.EnumerateItem;
import com.saber.credit.entities.Menu;
import com.saber.credit.service.impl.EnumerateServiceImpl;
import com.saber.credit.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by saber on 2019/6/7
 */
public class BaseController {

    @Autowired
    private MenuServiceImpl menuService;
    @Autowired
    private EnumerateServiceImpl enumerateService;

    /**
     * 获取sideBar的menu值
     *
     * @param model model
     */
    public void initPage(Model model) {
        List<Menu> menus = menuService.query();
        Map<String, List<Menu>> listMap = menus.stream().collect(Collectors.groupingBy(Menu::getPid));
        model.addAttribute("menus", listMap);
    }

    /**
     * 获取枚举类
     *
     * @param code code 枚举的统一标志
     */
    public Enumerate initEnumerate(String code) {
        Enumerate enumerate = enumerateService.queryByCode(code);
        List<EnumerateItem> enumerateItems = enumerateService.queryByPCode(enumerate.getCode());
        enumerate.setItemList(enumerateItems);
        return enumerate;
    }


    /**
     * 获取枚举类
     *
     * @param model  model
     * @param params params 枚举的统一标志
     */
    public void initEnumerate(Model model, String... params) {
        Map<String,Enumerate> map = new HashMap<>();
        for (String code : params) {
            Enumerate enumerate = enumerateService.queryByCode(code);
            List<EnumerateItem> enumerateItems = enumerateService.queryByPCode(enumerate.getCode());
            enumerate.setItemList(enumerateItems);
            map.put(code,enumerate);
        }
        model.addAttribute("enumerate", map);
    }

}

package com.saber.credit.controller.recommend;

import com.saber.credit.controller.BaseController;
import com.saber.credit.entities.*;
import com.saber.credit.service.impl.AdvertServiceImpl;
import com.saber.credit.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saber on 2019/6/17.
 * 广告推荐
 */
@Controller
public class AdsController extends BaseController {

    @Autowired
   private AdvertServiceImpl advertService;
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping(value = "/recommend/ads")
    public String list(Model model,@Value("轮播图") String type) {
        return loadData(model, type, "recommend/ads");
    }

    @GetMapping(value = "/recommend/ads/refresh")
    public String localRefresh(Model model, @RequestParam("type") String type,Map<String,Object> map) {
        map.put("type",type);
        return loadData(model, type, "recommend/ads::frame_refresh");
    }

    private String loadData(Model model, String type, String view) {
        initPage(model);
        Map<String, ImgOptions> map = new HashMap<>();
        map.put("轮播图", new ImgOptions("IMG_RECOMMEND_LBT","轮播图", 750, 350, 200, ""));
        map.put("横幅", new ImgOptions("IMG_RECOMMEND_HF","横幅", 750, 150, 200, ""));
        map.put("拼图", new ImgOptions("IMG_RECOMMEND_PT","拼图", 350, 300, 200, ""));
        map.put("首页弹窗", new ImgOptions("IMG_RECOMMEND_SYTC","首页弹窗", 300, 300, 200, ""));
        model.addAttribute("imgOptions", map.get(type));
        initEnumerate(model, "IMG_RECOMMEND");
        Advert advert = new Advert();
        advert.setFunc(type);
        Enumerate enumerate;
        if (type.equals("首页弹窗")){//前端首页弹窗的select内容为产品名
            Product product = new Product();
            enumerate = new Enumerate();
            enumerate.setValue("首页弹窗");
            product.setIsShow("是");
            List<Product> products = productService.query(product);
            List<EnumerateItem> enumerateItems = new ArrayList<>();
            for (Product temp : products) {
                EnumerateItem enumerateItem = new EnumerateItem();
                enumerateItem.setValue(temp.getName());
                enumerateItems.add(enumerateItem);
            }
            enumerate.setItemList(enumerateItems);
        }else{//前端其他内容的select内容为对应的枚举类
             enumerate = initEnumerate(map.get(type).getCode());
        }
        List<Advert> adverts = advertService.query(advert);
        model.addAttribute("selectPosition", enumerate);
        model.addAttribute("adverts", adverts);
        return view;
    }

    @PostMapping(value = "/recommend/ads/save")
    public String save(Model model, Advert advert) {
        advertService.insert(advert);
        model.addAttribute("msg","success");
        return list(model,advert.getFunc());
    }

    @PutMapping("/advert/update")
    public String update(Model model,@RequestBody Advert advert){
        advertService.update(advert);
        model.addAttribute("msg","success");
        return list(model,advert.getFunc());
    }

    @GetMapping("/advert/detail")
    public String detail(Model model){
        return loadData(model,null,"detail");
    }

}

package com.saber.credit.controller.recommend;

import com.saber.credit.controller.BaseController;
import com.saber.credit.entities.Advert;
import com.saber.credit.entities.Enumerate;
import com.saber.credit.entities.ImgOptions;
import com.saber.credit.entities.Product;
import com.saber.credit.service.impl.AdvertServiceImpl;
import com.saber.credit.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String list(Model model, @Value("轮播图") String type) {
        return loadData(model, type, "recommend/adsList");
    }

    @GetMapping(value = "/recommend/ads/refresh")
    public String localRefresh(Model model, @RequestParam("type") String type, Map<String, Object> map) {
        map.put("type", type);
        return loadData(model, type, "recommend/adsList::frame_refresh");
    }

    private String loadData(Model model, String type, String view) {
        initPage(model);
        Map<String, ImgOptions> map = new HashMap<>();
        map.put("轮播图", new ImgOptions("IMG_RECOMMEND_LBT", "轮播图", 750, 350, 200, ""));
        map.put("横幅", new ImgOptions("IMG_RECOMMEND_HF", "横幅", 750, 150, 200, ""));
        map.put("拼图", new ImgOptions("IMG_RECOMMEND_PT", "拼图", 350, 300, 200, ""));
        map.put("首页弹窗", new ImgOptions("IMG_RECOMMEND_SYTC", "首页弹窗", 300, 300, 200, ""));
        initEnumerate(model, "IMG_RECOMMEND");
        Advert advert = new Advert();
        advert.setFunc(type);
        List<Advert> adverts = advertService.query(advert);
        getSelectedPosition(model, type, map);
        model.addAttribute("adverts", adverts);
        return view;
    }

    @PostMapping(value = "/recommend/ads/save")
    public String save(Model model, Advert advert) {
        advertService.insert(advert);
        model.addAttribute("msg", "success");
        return list(model, advert.getFunc());
    }

    @PutMapping("/advert/update")
    public String update(Model model, @RequestBody Advert advert) {
        Advert tempAdvert = new Advert();
        tempAdvert.setPosition(advert.getPosition());
        List<Advert> adverts = advertService.query(tempAdvert);
        if (adverts.size()!=0) {//非隐藏广告的位置被占用时隐藏的广告不允许开启显示，其他显示的广告不允许更换成这个位置
            advertService.update(advert);
            model.addAttribute("msg", "success");
            return list(model, advert.getFunc());
        }else {
            model.addAttribute("msg", "failed");
            return "recommend/adsDetail";
        }
    }

    @GetMapping("/advert/detail/{type}/{id}")
    public String detail(Model model, @PathVariable("type") String type, @PathVariable("id") String id) {
        Advert advert = advertService.queryById(id);
        initPage(model);
        Map<String, ImgOptions> map = new HashMap<>();
        map.put("轮播图", new ImgOptions("IMG_RECOMMEND_LBT", "轮播图", 750, 350, 200, ""));
        map.put("横幅", new ImgOptions("IMG_RECOMMEND_HF", "横幅", 750, 150, 200, ""));
        map.put("拼图", new ImgOptions("IMG_RECOMMEND_PT", "拼图", 350, 300, 200, ""));
        map.put("首页弹窗", new ImgOptions("IMG_RECOMMEND_SYTC", "首页弹窗", 300, 300, 200, ""));
        getSelectedPosition(model, type, map);
        model.addAttribute("advert", advert);
        return "recommend/adsDetail";
    }


    private void getSelectedPosition(Model model, String type, Map<String, ImgOptions> map) {

        Product product = new Product();
        product.setIsShow("是");
        List<Product> products = productService.query(product);
        Enumerate enumerate = initEnumerate(map.get(type).getCode());
        model.addAttribute("products", products);
        model.addAttribute("imgOptions", map.get(type));
        model.addAttribute("selectPosition", enumerate);
    }

    @DeleteMapping("/advert/{type}/{id}")
    public String delete(@PathVariable("type") String type,@PathVariable("id") String id,Model model,Map<String,Object> map){
        advertService.delete(id);
        map.put("msg","success");
        return list(model,type);
    }

}

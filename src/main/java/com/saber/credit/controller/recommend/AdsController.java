package com.saber.credit.controller.recommend;

import com.saber.credit.controller.BaseController;
import com.saber.credit.entities.Advert;
import com.saber.credit.entities.ImgOptions;
import com.saber.credit.service.impl.AdvertServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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


    @GetMapping(value = "/recommend/ads")
    public String list(Model model) {
        return loadData(model, "轮播图", "recommend/ads");
    }

    @GetMapping(value = "/recommend/ads/refresh")
    public String localRefresh(Model model, @RequestParam("type") String type) {
        return loadData(model, type, "recommend/ads::frame_refresh");
    }

    private String loadData(Model model, String type, String view) {
        initPage(model);
        initEnumerate(model, "IMG_RECOMMEND");
        Map<String, ImgOptions> map = new HashMap<>();
        map.put("轮播图", new ImgOptions("轮播图", 750, 350, 200, ""));
        map.put("横幅", new ImgOptions("横幅", 750, 150, 200, ""));
        map.put("拼图", new ImgOptions("拼图", 350, 300, 200, ""));
        map.put("首页弹窗", new ImgOptions("首页弹窗", 300, 300, 200, ""));
        model.addAttribute("imgOptions", map.get(type));
        List<Advert> adverts = advertService.query();
        model.addAttribute("adverts", adverts);
        return view;
    }

    @PostMapping(value = "/recommend/ads/save")
    public String save(Model model, Advert advert) {
        advertService.insert(advert);
        model.addAttribute("msg","success");
        return list(model);
    }

    @PutMapping("/advert/update")
    public String update(Model model,@RequestBody Advert advert){
        advertService.update(advert);
        model.addAttribute("msg","success");
        return list(model);
    }

}

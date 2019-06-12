package com.saber.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saber on 2019/6/12.
 * 产品
 */
@Controller
public class ProductController extends BaseController{

    @GetMapping(value = "/product/list")
    public String productList(Model model){
        initPage(model);
        return "product/list";
    }

    @GetMapping(value = "/product/add")
    public String toAddPage(Model model){
        initPage(model);
        initEnumerate(model,"SETTLEMENT_CYCLE","CREDIT_CYCLE","ACCOUNT_WAY","REPAYMENT_WAY");
        return "product/add";
    }

}

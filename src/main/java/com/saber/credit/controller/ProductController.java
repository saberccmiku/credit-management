package com.saber.credit.controller;

import com.saber.credit.entities.Product;
import com.saber.credit.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by saber on 2019/6/12.
 * 产品
 */
@Controller
public class ProductController extends BaseController{

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping(value = "/product/products")
    public String productList(Model model){
        initPage(model);
        return "product/list";
    }

    @GetMapping(value = "/product/add")
    public String toAddPage(Model model){
        initPage(model);
        initEnumerate(model,"SETTLEMENT_CYCLE","CREDIT_CYCLE","ACCOUNT_WAY","REPAYMENT_WAY","CREDIT_MATERIAL_TYPE","CREDIT_INFO","REVIEW_WAY","PREPAYMENT","VERIFY_WAY");
        return "product/add";
    }

    @PostMapping(value = "/product")
    public String saveProduct(Product product){
        productService.insert(product);
        return "redirect:/product/products";
    }

}

package com.saber.credit.controller;

import com.saber.credit.entities.Product;
import com.saber.credit.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        List<Product> products = productService.query(0, 10);
        String [] titleList = new String[]{"编号","logo","信贷名称","放款金额区间","放款周期区间","利息","详情页UV","按钮UV",
                "预计注册量","虚拟访问量","合作方式","合作价格","添加时间","产品上架状态","操作"};

        StringBuffer sb ;
        for(Product product:products){
            sb = new StringBuffer();
            //计算放款周期区间
            if (!StringUtils.isEmpty(product.getCreditCycle())){
                String[] array = product.getCreditCycle().split(",");
                if (array.length>1){
                    product.setCreditCycle(sb.append(array[0]).append("-").append(array[array.length-1]).toString());
                }
            }

        }
        model.addAttribute("products",products);
        model.addAttribute("titleArr",titleList);
        return "product/list";
    }

    @GetMapping(value = "/product/productInfo")
    public String detail(Model model){
        initPage(model);
        return "product/detail";
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

    @PutMapping(value = "/product/updateProduct")
    public String update( @RequestBody Product product,Model model) {
        Product tempProduct = new Product();
        tempProduct.setId(product.getId());
        tempProduct.setIsShow(product.getIsShow());
        productService.update(tempProduct);
        return productList(model);
    }


}

package com.maximus.ribbon.controller;

import com.maximus.ribbon.pojo.Product;
import com.maximus.ribbon.service.ProductClientRibbonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {
    @Resource
    private ProductClientRibbonService productService;

    @RequestMapping("getProducts")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}

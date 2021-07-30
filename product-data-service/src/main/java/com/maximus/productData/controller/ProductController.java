package com.maximus.productData.controller;

import com.maximus.productData.pojo.Product;
import com.maximus.productData.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {
    @Resource
    private ProductService productService;

    @RequestMapping("getProducts")
    public List<Product> getProducts() {
        return productService.listProducts();
    }
}

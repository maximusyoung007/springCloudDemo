package com.maximus.feign.controller;

import com.maximus.feign.pojo.Product;
import com.maximus.feign.service.ProductClientFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {
    @Resource
    private ProductClientFeignService feignService;

    @RequestMapping("getProducts")
    public List<Product> getProducts() {
        return feignService.getProducts();
    }
}

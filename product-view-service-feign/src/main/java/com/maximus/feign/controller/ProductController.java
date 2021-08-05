package com.maximus.feign.controller;

import com.alibaba.fastjson.JSONObject;
import com.maximus.feign.service.ProductClientFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class ProductController {
    @Resource
    private ProductClientFeignService feignService;

    @Value("${version}")
    String version;

    @RequestMapping("getProducts")
    public JSONObject getProducts() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("products", feignService.getProducts());
        jsonObject.put("version", version);
        return jsonObject;
    }
}

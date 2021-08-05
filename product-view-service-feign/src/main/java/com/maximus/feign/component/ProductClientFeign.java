package com.maximus.feign.component;

import com.maximus.feign.hystrix.ProductClientFeignHystrix;
import com.maximus.feign.pojo.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE", fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {
    @GetMapping("getProducts")
    List<Product> listProducts();
}

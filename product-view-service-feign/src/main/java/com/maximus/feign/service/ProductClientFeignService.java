package com.maximus.feign.service;

import com.maximus.feign.component.ProductClientFeign;
import com.maximus.feign.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductClientFeignService {
    @Autowired
    private ProductClientFeign clientFeign;

    public List<Product> getProducts() {
        return clientFeign.listProducts();
    }

}

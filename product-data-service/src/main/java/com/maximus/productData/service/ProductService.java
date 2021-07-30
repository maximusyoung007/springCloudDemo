package com.maximus.productData.service;

import com.maximus.productData.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Value("${server.port}")
    int port;

    public List<Product> listProducts() {
        List<Product> list = new ArrayList() {{
            add(new Product(1, "product a at port:" + port, 10));
            add(new Product(2, "product b at port:" + port, 20));
            add(new Product(3, "product c at port:" + port, 30));
        }};
        return list;
    }
}

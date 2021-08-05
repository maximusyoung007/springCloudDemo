package com.maximus.feign.hystrix;

import com.maximus.feign.component.ProductClientFeign;
import com.maximus.feign.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
    @Override
    public List<Product> listProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(0, "数据微服务不可用", 0));
        return list;
    }
}

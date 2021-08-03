package com.maximus.ribbon.component;

import com.maximus.ribbon.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductClientRibbon {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 从微服务中哪去需要的数据
     * PRODUCT_DATA_SERVICE是服务名
     * getProducts是路径名
     * @return
     */
    public List<Product> listProducts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/getProducts", List.class);
    }
}

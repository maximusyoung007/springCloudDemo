package com.maximus.ribbon.service;

import com.maximus.ribbon.component.ProductClientRibbon;
import com.maximus.ribbon.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductClientRibbonService {
    @Autowired
    private ProductClientRibbon clientRibbon;

    public List<Product> getProducts() {
        return clientRibbon.listProducts();
    }

}

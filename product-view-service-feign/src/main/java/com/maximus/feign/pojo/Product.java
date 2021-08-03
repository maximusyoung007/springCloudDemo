package com.maximus.feign.pojo;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String productName;
    private int price;

    public Product(int id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public Product() {
        
    }
}

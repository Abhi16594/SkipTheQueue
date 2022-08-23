package com.mp.skipthequeue.controller;

import com.mp.skipthequeue.entity.Product;
import com.mp.skipthequeue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/product")
    public Product saveProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.saveProduct(product);
    }
}

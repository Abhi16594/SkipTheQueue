package com.mp.skipthequeue.controller;

import com.mp.skipthequeue.entity.Product;
import com.mp.skipthequeue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/products")
    public Product saveProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.saveProduct(product);
    }

    @GetMapping(path = "/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping(path = "/products/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @DeleteMapping(path="/products")
    public ResponseEntity<String> deleteAll() {
        return new ResponseEntity<>(productService.deleteAll(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/products/{id}")
    public String deleteById(@PathVariable Long id){
        return productService.deleteById(id);
    }
}

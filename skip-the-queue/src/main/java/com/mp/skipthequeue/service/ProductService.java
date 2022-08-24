package com.mp.skipthequeue.service;

import com.mp.skipthequeue.entity.Product;
import com.mp.skipthequeue.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getById(Long id){
       Optional<Product> optionalProduct =  productRepository.findById(id);
       if (optionalProduct.isEmpty()){
           return null;
       }
       return optionalProduct.get();
    }

    public String deleteAll() {
        productRepository.deleteAll();
        return "all products are deleted";
    }

    public String deleteById(Long id){
        Optional<Product> optionalProduct =  productRepository.findById(id);
        if (optionalProduct.isEmpty()){
            return "Product not found";
        }
        productRepository.deleteById(id);
        return "Product is deleted";
    }
}

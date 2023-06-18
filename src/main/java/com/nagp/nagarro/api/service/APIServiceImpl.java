package com.nagp.nagarro.api.service;

import com.nagp.nagarro.api.entity.Products;
import com.nagp.nagarro.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APIServiceImpl {

    @Autowired
    ProductRepository productRepository;
    public List<Products> getProducts() {
        return productRepository.findAll();

    }
}

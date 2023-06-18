package com.nagp.nagarro.api.controller;

import com.nagp.nagarro.api.entity.Products;
import com.nagp.nagarro.api.service.APIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/products")
public class APIController {

    @Autowired
    APIServiceImpl apiService;
    @GetMapping
    public List<Products> getProducts() {
        return apiService.getProducts();


    }
}


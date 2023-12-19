package com.example.spingTest.controller;

import com.example.spingTest.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Brand")
public class BrandController {
    public BrandController(ProductService productService) {
        this.productService = productService;
    }

    ProductService productService;
}

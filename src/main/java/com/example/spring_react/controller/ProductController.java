package com.example.spring_react.controller;

import com.example.spring_react.model.dto.ProductRequestDTO;
import com.example.spring_react.model.dto.ProductResponseDTO;
import com.example.spring_react.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProductResponseDTO> getAll() {

        return productService.getAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void save(@RequestBody ProductRequestDTO data) {

        productService.save(data);
    }

}
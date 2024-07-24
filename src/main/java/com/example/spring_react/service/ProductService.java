package com.example.spring_react.service;

import com.example.spring_react.model.Product;
import com.example.spring_react.model.dto.ProductRequestDTO;
import com.example.spring_react.model.dto.ProductResponseDTO;
import com.example.spring_react.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductResponseDTO> getAll() {
        return productRepository.findAll().stream().map(ProductResponseDTO::new).toList();
    }

    public void save(ProductRequestDTO data) {

        Product product = new Product();

        product.setName(data.name());
        product.setPrice(data.price());
        product.setQuantity(data.quantity());

        productRepository.save(product);
    }
}
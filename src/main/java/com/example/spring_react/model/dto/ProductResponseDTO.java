package com.example.spring_react.model.dto;

import com.example.spring_react.model.Product;

public record ProductResponseDTO(Long id, String name, double price, double quantity) {

    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice(), product.getQuantity());
    }

}
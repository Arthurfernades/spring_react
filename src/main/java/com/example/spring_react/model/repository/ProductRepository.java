package com.example.spring_react.model.repository;

import com.example.spring_react.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
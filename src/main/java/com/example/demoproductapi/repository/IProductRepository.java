package com.example.demoproductapi.repository;

import com.example.demoproductapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}

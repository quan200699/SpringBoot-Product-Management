package com.example.demoproductapi.repository;

import com.example.demoproductapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}

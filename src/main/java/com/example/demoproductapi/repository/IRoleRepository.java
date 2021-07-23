package com.example.demoproductapi.repository;

import com.example.demoproductapi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}

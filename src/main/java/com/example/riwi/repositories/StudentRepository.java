package com.example.riwi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.riwi.model.studentEntity;

public interface StudentRepository extends JpaRepository<studentEntity, Long> {
    
}

package com.example.riwi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.riwi.model.MultimediaEntity;

@Repository
public interface MultimediaRepository extends JpaRepository<MultimediaEntity, Long> {
    
}

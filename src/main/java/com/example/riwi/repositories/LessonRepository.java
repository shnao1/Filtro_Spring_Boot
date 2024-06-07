package com.example.riwi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.riwi.model.LessonEntity;

@Repository
public interface LessonRepository extends JpaRepository<LessonEntity, Long>{
    
}

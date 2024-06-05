package com.example.riwi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.riwi.model.ClassEntity;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long>{

    
}

package com.example.riwi.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.riwi.repositories.ClassRepository;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;
    
    
}

package com.example.riwi.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.riwi.repositories.LessonRepository;

@Service
public class LessonService {
    @Autowired
    private LessonRepository lessonRepository;
}

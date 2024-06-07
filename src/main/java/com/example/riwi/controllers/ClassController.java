package com.example.riwi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.riwi.infraestructure.services.ClassService;

@RestController
@RequestMapping(path = "/class")
public class ClassController {
    @Autowired
    private ClassService classService;
    
}

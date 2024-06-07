package com.example.riwi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.riwi.infraestructure.services.MultimediaService;

@RestController
@RequestMapping("/api/multimedia")
public class MultimediaController {
    @Autowired
    private MultimediaService multimediaService;
}

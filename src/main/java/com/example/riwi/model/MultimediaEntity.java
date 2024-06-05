package com.example.riwi.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MultimediaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String multimediaType;
    private String multimediaUrl;
    private LocalDate multimediaCreated_at;
    private boolean multimediaActive;

    @ManyToOne
    @JoinColumn(name = "lesson_entity_id")
    private LessonEntity lessonEntity;

    public MultimediaEntity() {
    }

    public MultimediaEntity(Long id, String multimediaType, String multimediaUrl, LocalDate multimediaCreated_at,
            boolean multimediaActive, LessonEntity lessonEntity) {
        this.id = id;
        this.multimediaType = multimediaType;
        this.multimediaUrl = multimediaUrl;
        this.multimediaCreated_at = multimediaCreated_at;
        this.multimediaActive = multimediaActive;
        this.lessonEntity = lessonEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMultimediaType() {
        return multimediaType;
    }

    public void setMultimediaType(String multimediaType) {
        this.multimediaType = multimediaType;
    }

    public String getMultimediaUrl() {
        return multimediaUrl;
    }

    public void setMultimediaUrl(String multimediaUrl) {
        this.multimediaUrl = multimediaUrl;
    }

    public LocalDate getMultimediaCreated_at() {
        return multimediaCreated_at;
    }

    public void setMultimediaCreated_at(LocalDate multimediaCreated_at) {
        this.multimediaCreated_at = multimediaCreated_at;
    }

    public boolean isMultimediaActive() {
        return multimediaActive;
    }

    public void setMultimediaActive(boolean multimediaActive) {
        this.multimediaActive = multimediaActive;
    }

    
    
}

package com.example.riwi.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lessonTitle;
    private String lessonContent;
    private LocalDate lessonCreated_at;
    private boolean lessonActive;

    @ManyToOne
    @JoinColumn(name = "class_entity_id")
    private ClassEntity classEntity;

    @OneToMany(mappedBy = "lessonEntity")
    private Set<MultimediaEntity> multimediaEntity;

    public LessonEntity() {
    }

    public LessonEntity(Long id, String lessonTitle, String lessonContent, LocalDate lessonCreated_at,
            boolean lessonActive, ClassEntity classEntity, Set<MultimediaEntity> multimediaEntity) {
        this.id = id;
        this.lessonTitle = lessonTitle;
        this.lessonContent = lessonContent;
        this.lessonCreated_at = lessonCreated_at;
        this.lessonActive = lessonActive;
        this.classEntity = classEntity;
        this.multimediaEntity = multimediaEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public void setLessonTitle(String lessonTitle) {
        this.lessonTitle = lessonTitle;
    }

    public String getLessonContent() {
        return lessonContent;
    }

    public void setLessonContent(String lessonContent) {
        this.lessonContent = lessonContent;
    }

    public LocalDate getLessonCreated_at() {
        return lessonCreated_at;
    }

    public void setLessonCreated_at(LocalDate lessonCreated_at) {
        this.lessonCreated_at = lessonCreated_at;
    }

    public boolean isLesssonActive() {
        return lessonActive;
    }

    public void setLesssonActive(boolean lesssonActive) {
        this.lessonActive = lesssonActive;
    }

    
    
}

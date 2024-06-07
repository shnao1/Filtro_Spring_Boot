package com.example.riwi.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String className;
    private String classDescription;
    private LocalDate classCreated_at;
    private boolean classActive;

    @OneToMany(mappedBy = "classEntity")
    private List<studentEntity> studentEntities;

    @OneToMany(mappedBy = "classEntity")
    private Set<LessonEntity> lessonEntity;

    public ClassEntity() {
    }

    public ClassEntity(Long id, String className, String classDescription, LocalDate classCreated_at,
            boolean classActive, List<studentEntity> studentEntities, Set<LessonEntity> lessonEntity) {
        this.id = id;
        this.className = className;
        this.classDescription = classDescription;
        this.classCreated_at = classCreated_at;
        this.classActive = classActive;
        this.studentEntities = studentEntities;
        this.lessonEntity = lessonEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassDescription() {
        return classDescription;
    }

    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public LocalDate getClassCreated_at() {
        return classCreated_at;
    }

    public void setClassCreated_at(LocalDate classCreated_at) {
        this.classCreated_at = classCreated_at;
    }

    public boolean isClassActive() {
        return classActive;
    }

    public void setClassActive(boolean classActive) {
        this.classActive = classActive;
    }

    public List<studentEntity> getStudentEntities() {
        return studentEntities;
    }

    public void setStudentEntities(List<studentEntity> studentEntities) {
        this.studentEntities = studentEntities;
    }

    public Set<LessonEntity> getLessonEntity() {
        return lessonEntity;
    }

    public void setLessonEntity(Set<LessonEntity> lessonEntity) {
        this.lessonEntity = lessonEntity;
    }

    public static Object Builder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Builder'");
    }

    public LocalDate getCreatedAt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCreatedAt'");
    }

    public static ClassEntity builder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'builder'");
    }

    public Object className(String className2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'className'");
    }

    
    
    
    
}

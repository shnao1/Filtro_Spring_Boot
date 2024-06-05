package com.example.riwi.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class studentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String studentEmail;
    private LocalDate studentCreated_at;
    private boolean studentActive;

    @ManyToOne
    @JoinColumn(name = "class_entity_id")
    private ClassEntity classEntity;

    public studentEntity() {
    }

    public studentEntity(Long id, String studentName, String studentEmail, LocalDate studentCreated_at,
            boolean studentActive, ClassEntity classEntity) {
        this.id = id;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCreated_at = studentCreated_at;
        this.studentActive = studentActive;
        this.classEntity = classEntity;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public LocalDate getStudentCreated_at() {
        return studentCreated_at;
    }

    public void setStudentCreated_at(LocalDate studentCreated_at) {
        this.studentCreated_at = studentCreated_at;
    }

    public boolean isStudentActive() {
        return studentActive;
    }

    public void setStudentActive(boolean studentActive) {
        this.studentActive = studentActive;
    }

    

    
}

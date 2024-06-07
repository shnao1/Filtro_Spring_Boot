package com.example.riwi.infraestructure.helpers;

import javax.swing.text.html.parser.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.riwi.utils.exceptions.BadIdException;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Component
public class ServiceHelper {
    public <entity, Id> Entity find(Id id, JpaRepository<Entity, Id> repository, String Name){
        return repository.findById(id)
                    .orElseThrow(() -> new BadIdException(Name));
    }
}

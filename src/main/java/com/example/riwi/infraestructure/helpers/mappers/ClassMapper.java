package com.example.riwi.infraestructure.helpers.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.riwi.dto.request.ClassReq;
import com.example.riwi.dto.response.ClassResp;
import com.example.riwi.infraestructure.helpers.ServiceHelper;
import com.example.riwi.infraestructure.helpers.abstract_mappers.IClassMapper;
import com.example.riwi.model.ClassEntity;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ClassMapper implements IClassMapper {

    @Autowired
    private final ServiceHelper helper;

    @Override
    public ClassEntity requestToEntity(ClassReq request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'entityToResponse'");
    }

    @Override
    public ClassResp entityToResponse(ClassEntity entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'entityToResponse'");
    }
    
}

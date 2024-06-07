package com.example.riwi.infraestructure.helpers.abstract_mappers;

import com.example.riwi.dto.request.ClassReq;
import com.example.riwi.dto.response.ClassResp;
import com.example.riwi.model.ClassEntity;

public interface IClassMapper
        extends MapperBase<ClassReq, ClassEntity, ClassResp> {
                ClassEntity requestToEntity(ClassReq request);
                ClassResp entityToResponse(ClassEntity entity);
}

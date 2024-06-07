package com.example.riwi.infraestructure.helpers.abstract_mappers;

import com.example.riwi.dto.request.LessonReq;
import com.example.riwi.dto.response.LessonResp;
import com.example.riwi.model.LessonEntity;

public interface ILessonMapper
        extends MapperBase<LessonReq,LessonEntity,LessonResp> {
    
}

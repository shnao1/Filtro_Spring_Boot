package com.example.riwi.infraestructure.helpers.abstract_mappers;

import com.example.riwi.dto.request.StudentReq;
import com.example.riwi.dto.response.StudentResp;
import com.example.riwi.model.studentEntity;

public interface IStudentMapper
        extends MapperBase<StudentReq,studentEntity,StudentResp> {
    
}

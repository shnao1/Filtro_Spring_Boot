package com.example.riwi.error_handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.riwi.dto.errors.BaseErrorsResp;
import com.example.riwi.dto.errors.ErrorsResp;
import com.example.riwi.utils.exceptions.BadIdException;

@RestControllerAdvice
public class ErrorsController {
    
    @ExceptionHandler(BadIdException.class)
    public BaseErrorsResp handlerIdError (BadIdException exception) {
        List<Map<String, String>> errors = new ArrayList<>();
        Map<String, String> errorResponse = new HashMap<>();

        errorResponse.put("Error", "ID not found");
        errorResponse.put("Entity", exception.getMessage());
        errors.add(errorResponse);

        return ErrorsResp.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .status(HttpStatus.NOT_FOUND.name())
                .errors(errors)
                .build();
    }

}

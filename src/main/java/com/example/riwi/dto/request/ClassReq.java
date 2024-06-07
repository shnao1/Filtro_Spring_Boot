package com.example.riwi.dto.request;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassReq {
    private String className;
    private String classDescription;
    private LocalDate createdAt;
    private boolean active;

}

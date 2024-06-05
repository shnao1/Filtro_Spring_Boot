package com.example.riwi.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassResp {
    private Long id;
    private String className;
    private String classDescription;
    private LocalDate classCreated_at;
    private boolean classActive;
}

package com.example.riwi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassReq {
    @NotBlank( message = "La informacion es requerida")
    @Size(min = 0, max = 100)
    private String className;
    private String classDescription;
    @NotNull( message = "Attendance information is required")
    private boolean classActive;

}

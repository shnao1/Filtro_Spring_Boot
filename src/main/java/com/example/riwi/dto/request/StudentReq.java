package com.example.riwi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentReq {
    @NotBlank( message = "Information is required")
    @Size(min = 1, max = 100)
    private String studentName;
    @Email
    private String studentEmail;
    @NotNull( message = "Attendance information is required")
    private boolean studentActive;
}

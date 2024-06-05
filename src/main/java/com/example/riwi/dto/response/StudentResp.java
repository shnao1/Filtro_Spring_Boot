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
public class StudentResp {
    private Long id;
    private String studentName;
    private String studentEmail;
    private ClassResp idClassResp;
    private LocalDate studentCreated_at;
    private boolean studentActive;
}

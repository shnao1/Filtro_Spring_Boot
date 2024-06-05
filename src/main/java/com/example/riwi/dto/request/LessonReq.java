package com.example.riwi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonReq {
    @NotBlank( message = "Information is required")
    @Size(min = 1, max = 100)
    private String lessonTitle;
    @NotBlank( message = "Information is required")
    @Size(min = 20, max = 100)
    private String lessonContent;
    @NotNull( message = "Attendance information is required")
    private boolean lessonActive;
}

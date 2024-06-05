package com.example.riwi.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonResp {
    private Long id;
    private String lessonTitle;
    private String lessonContent;
    private ClassResp idClassResp;
    private LocalDate lessonCreated_at;
    private boolean active;
}

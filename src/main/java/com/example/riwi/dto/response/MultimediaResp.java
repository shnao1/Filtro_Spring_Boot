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
public class MultimediaResp {
    private Long id;
    private String multimediaType;
    private String multimediaUrl;
    private LessonResp idLessonResp;
    private LocalDate multimediaCreated_at;
    private boolean multimediaActive;
}

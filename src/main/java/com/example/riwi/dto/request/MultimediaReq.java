package com.example.riwi.dto.request;

import com.example.riwi.utils.enums.MultimediaType;

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
public class MultimediaReq {
    @NotBlank(message = "Information is required")
    @Size( 
        min = 1,
        max = 300
    )
    private String multimediaUrl;
    @NotNull( message = "You must choose a format type")
    private MultimediaType multimediaType;
    private boolean multimediaActive;
}

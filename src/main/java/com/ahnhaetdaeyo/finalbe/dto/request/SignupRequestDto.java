package com.ahnhaetdaeyo.finalbe.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Schema(description = "회원가입 요청DTO")
@Getter
@Builder
@AllArgsConstructor
public class SignupRequestDto {
    private String email;
    
}

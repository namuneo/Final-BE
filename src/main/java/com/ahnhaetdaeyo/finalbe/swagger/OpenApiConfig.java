package com.ahnhaetdaeyo.finalbe.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "안했대요 API 명세서",
                description = "API 명세서",
                version = "v1"
        )
)
//todo: SecuritySchemes
@Configuration
public class OpenApiConfig {
    // 그룹 설정된 api들만 문서에 노출 시킬 수 있게 해준다.
//    @Bean
//    public GroupedOpenApi sampleGroupOpenApi() {
//        String[] paths = {"/member/**"};
//
//        return GroupedOpenApi.builder().group("샘플 멤버 API").pathsToMatch(paths)
//            .build();
//    }
}

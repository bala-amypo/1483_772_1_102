package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {

        SecurityScheme securityScheme = new SecurityScheme()
                .name("Authorization")
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT");

        return new OpenAPI()
                .info(new Info()
                        .title("Digital Warranty Tracker API")
                        .version("1.0"))
                // 🔴 IMPORTANT: define backend server
                .addServersItem(new Server().url("https://9007.pro604cr.amypo.ai/"))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes("Authorization", securityScheme))
                // 🔴 Apply JWT only when needed (Swagger UI button)
                .addSecurityItem(new SecurityRequirement().addList("Authorization"));
    }
}

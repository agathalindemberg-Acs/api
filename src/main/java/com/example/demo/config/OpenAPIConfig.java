package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI openAPIdocumentarion() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("C.A.R API")
                                .description("API do sistema C.A.R")
                                .version("v1.0")
                                .contact(new Contact()
                                        .name("Alexandre Saudate")
                                        .email("alesaudade@gmail.com")
                                )
                );
    }
}

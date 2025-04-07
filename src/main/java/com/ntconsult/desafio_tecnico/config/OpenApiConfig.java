package com.ntconsult.desafio_tecnico.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Votação Cooperativa")
                        .version("1.0")
                        .description("Gerenciamento de pautas, sessões e votos de associados em um sistema de cooperativa.")
                        .contact(new Contact()
                                .name("Seu Nome")
                                .email("seuemail@exemplo.com")
                                .url("https://github.com/seuusuario")));
    }
}

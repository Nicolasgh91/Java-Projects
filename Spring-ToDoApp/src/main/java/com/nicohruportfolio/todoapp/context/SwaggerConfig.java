package com.nicohruportfolio.todoapp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.nicohruportfolio.todoapp.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {

        return new ApiInfo(
                "Todo API",
                "La API rest de la APP Todo",
                "v1.0",
                "NicoReserved",
                new Contact("Nicolas Hruszczak", "https://nicolasgh91.github.io/Portfolio/","nicolasgabrielh91@gmail.com"),
                "Todos los izquierdos reservados", "https://www.linkedin.com/in/nicolasgabrielhruszczak/", Collections.emptyList()
        );
    }
}

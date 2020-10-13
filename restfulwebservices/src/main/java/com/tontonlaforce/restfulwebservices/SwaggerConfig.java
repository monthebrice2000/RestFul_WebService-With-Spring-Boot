package com.tontonlaforce.restfulwebservices;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Documentation;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final Contact DEFAULT_CONTACT = new Contact ( "TONTON LA FORCE", "https://www.youtube.com/user/durgasoftware", "in TONTON LA FORCE" );
    public static final ApiInfo DEFAULT_API_INFOS = new ApiInfo( "TONTON LA FORCE","API FROM TONTON LA FORCE","1.0","https://localhost/8080/apis", DEFAULT_CONTACT, "Apache Netbeans", "https://debrouille toi");

    @Bean
    public Docket api(){

        return new Docket( DocumentationType.SWAGGER_2 ).apiInfo(DEFAULT_API_INFOS).produces(new HashSet<>(Arrays.asList("application/xml","application/json")))
                .consumes(new HashSet<>(Arrays.asList("application/xml","application/json")));
    }


}

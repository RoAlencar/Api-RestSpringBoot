package br.com.raxinformatica.apirest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.raxinformatica.apirest"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "Produtos API REST",
                "API REST de cadastro de produtos.",
                "1.0",
                "Terms of Service",
                new Contact("Rodrigo de Alencar Xavier","https://www.linkedin.com/in/rodrigo-de-alencar-xavier-a873b4140/","roalencarx@gmail.com"),
                "MIT License","https://choosealicense.com/licenses/mit/", new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }
}
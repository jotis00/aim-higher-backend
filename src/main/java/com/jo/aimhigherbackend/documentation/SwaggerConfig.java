package com.jo.aimhigherbackend.documentation;

import org.springframework.boot.autoconfigure.web.servlet.ConditionalOnMissingFilterBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("AH Mobile App API")
                .description("REST API documentation for the Aim Higher Mobile App")
                .version("1.0.0")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jo.aimhigherbackend"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo)
                .enable(true);
    }

}

package com.mercadolivro.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Mercado Livro")
                    .description("API do Mercado Livro")
                    .version("1.0")
            )
    }
}
//
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import springfox.documentation.builders.ApiInfoBuilder
//import springfox.documentation.builders.PathSelectors
//import springfox.documentation.builders.RequestHandlerSelectors
//import springfox.documentation.spi.DocumentationType
//import springfox.documentation.spring.web.plugins.Docket
//import springfox.documentation.swagger2.annotations.EnableSwagger2
//
//@Configuration
//@EnableSwagger2
//class SwaggerConfig {
//
//    @Bean
//    fun api(): Docket  = Docket(DocumentationType.SWAGGER_2)
//        .select()
//        .apis(RequestHandlerSelectors.basePackage("com.mercadolivro.controller"))
//        .paths(PathSelectors.any())
//        .build()
//
//        .apiInfo(ApiInfoBuilder()
//            .title("Mercado Livro")
//            .description("Api do Mercado Livro")
//            .build())
//}
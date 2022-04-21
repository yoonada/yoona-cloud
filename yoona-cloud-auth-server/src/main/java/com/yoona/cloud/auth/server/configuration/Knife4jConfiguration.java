package com.yoona.cloud.auth.server.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author: yoonada
 * @email: m15602498163@163.com
 * @create: 2021-08-31 18:59
 * @description:
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("yoona-cloud-auth-server RESTful APIs")
                        .description("# yoona-cloud-auth-server RESTful APIs")
                        .contact("m15602498163@163.com")
                        .version("1.0")
                        .build())
                //分组名称
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.yoona.user.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
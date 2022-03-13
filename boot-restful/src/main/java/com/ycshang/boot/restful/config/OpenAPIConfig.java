package com.ycshang.boot.restful.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: openAPI配置
 * @author: ycshang
 * @create: 2022-03-13 13:05
 **/
@Configuration
public class OpenAPIConfig {
    @Bean
    public GroupedOpenApi articleApi() {
        return GroupedOpenApi.builder().group("api-v1-articles").pathsToMatch("/api/v1/articles/**").build();
    }

    @Bean
    public GroupedOpenApi helloApi() {
        return GroupedOpenApi.builder().group("hello").pathsToMatch("/hello/**").build();
    }
}

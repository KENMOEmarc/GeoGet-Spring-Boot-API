package com.wrath.GeoGet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfiguration {

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.baseUrl("https://restcountries.com/v3.1").build();
    }

}

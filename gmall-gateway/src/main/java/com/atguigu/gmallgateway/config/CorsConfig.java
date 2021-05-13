package com.atguigu.gmallgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {
    @Bean
    public CorsWebFilter corsWebFilter(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://manager.gmall.com");
        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        corsConfiguration.addAllowedOrigin("http://127.0.0.1:1000");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setAllowCredentials(true);


        UrlBasedCorsConfigurationSource configurationSurce = new UrlBasedCorsConfigurationSource();
        configurationSurce.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(configurationSurce);
    }
}

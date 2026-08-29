package com.apinexus.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EdgeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdgeGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("identity_route", r -> r.path("/auth/**")
                .filters(f -> f.stripPrefix(1))
                .uri("http://identity-service:8081"))
            .route("registry_route", r -> r.path("/api/registry/**")
                .filters(f -> f.stripPrefix(2))
                .uri("http://api-registry-service:8083"))
            .route("developer_route", r -> r.path("/api/dev/**")
                .filters(f -> f.stripPrefix(2))
                .uri("http://developer-service:8086"))
            .route("ai_route", r -> r.path("/api/ai/**")
                .uri("http://ai-intelligence:8000"))
            .build();
    }
}

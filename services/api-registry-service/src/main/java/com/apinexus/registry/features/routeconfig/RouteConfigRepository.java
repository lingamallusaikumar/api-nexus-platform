package com.apinexus.registry.features.routeconfig;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteConfigRepository extends JpaRepository<RouteConfig, Long> {
    RouteConfig findByName(String name);
}

package com.apinexus.registry.features.websocketroute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebSocketRouteRepository extends JpaRepository<WebSocketRoute, Long> {
    WebSocketRoute findByName(String name);
}

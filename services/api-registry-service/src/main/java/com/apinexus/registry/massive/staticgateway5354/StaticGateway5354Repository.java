package com.apinexus.registry.massive.staticgateway5354;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticGateway5354Repository extends JpaRepository<StaticGateway5354, Long> {
    StaticGateway5354 findByName(String name);
}

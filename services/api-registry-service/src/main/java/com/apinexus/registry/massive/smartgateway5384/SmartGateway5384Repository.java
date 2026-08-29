package com.apinexus.registry.massive.smartgateway5384;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartGateway5384Repository extends JpaRepository<SmartGateway5384, Long> {
    SmartGateway5384 findByName(String name);
}

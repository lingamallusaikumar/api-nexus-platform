package com.apinexus.registry.massive.zonegateway7531;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneGateway7531Repository extends JpaRepository<ZoneGateway7531, Long> {
    ZoneGateway7531 findByName(String name);
}

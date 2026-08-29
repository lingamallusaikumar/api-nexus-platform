package com.apinexus.registry.massive.hubbridge7135;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubBridge7135Repository extends JpaRepository<HubBridge7135, Long> {
    HubBridge7135 findByName(String name);
}

package com.apinexus.registry.massive.cyberbroker8313;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberBroker8313Repository extends JpaRepository<CyberBroker8313, Long> {
    CyberBroker8313 findByName(String name);
}

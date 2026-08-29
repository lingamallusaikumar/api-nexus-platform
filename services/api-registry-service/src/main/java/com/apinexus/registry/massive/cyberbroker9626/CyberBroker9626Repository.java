package com.apinexus.registry.massive.cyberbroker9626;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberBroker9626Repository extends JpaRepository<CyberBroker9626, Long> {
    CyberBroker9626 findByName(String name);
}

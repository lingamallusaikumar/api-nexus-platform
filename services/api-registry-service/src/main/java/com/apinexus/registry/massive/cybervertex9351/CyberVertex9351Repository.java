package com.apinexus.registry.massive.cybervertex9351;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberVertex9351Repository extends JpaRepository<CyberVertex9351, Long> {
    CyberVertex9351 findByName(String name);
}

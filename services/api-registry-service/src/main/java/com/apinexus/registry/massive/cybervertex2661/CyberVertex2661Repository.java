package com.apinexus.registry.massive.cybervertex2661;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberVertex2661Repository extends JpaRepository<CyberVertex2661, Long> {
    CyberVertex2661 findByName(String name);
}

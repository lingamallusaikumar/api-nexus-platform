package com.apinexus.registry.massive.cyberstore6534;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberStore6534Repository extends JpaRepository<CyberStore6534, Long> {
    CyberStore6534 findByName(String name);
}

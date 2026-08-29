package com.apinexus.registry.massive.cyberflow8856;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberFlow8856Repository extends JpaRepository<CyberFlow8856, Long> {
    CyberFlow8856 findByName(String name);
}

package com.apinexus.registry.massive.digitalbridge693;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalBridge693Repository extends JpaRepository<DigitalBridge693, Long> {
    DigitalBridge693 findByName(String name);
}

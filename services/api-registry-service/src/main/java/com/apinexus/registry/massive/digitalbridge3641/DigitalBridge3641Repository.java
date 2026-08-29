package com.apinexus.registry.massive.digitalbridge3641;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalBridge3641Repository extends JpaRepository<DigitalBridge3641, Long> {
    DigitalBridge3641 findByName(String name);
}

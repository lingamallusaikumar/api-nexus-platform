package com.apinexus.registry.massive.digitalprocess7489;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalProcess7489Repository extends JpaRepository<DigitalProcess7489, Long> {
    DigitalProcess7489 findByName(String name);
}

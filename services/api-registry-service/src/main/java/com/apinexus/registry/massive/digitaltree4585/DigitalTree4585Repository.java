package com.apinexus.registry.massive.digitaltree4585;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalTree4585Repository extends JpaRepository<DigitalTree4585, Long> {
    DigitalTree4585 findByName(String name);
}

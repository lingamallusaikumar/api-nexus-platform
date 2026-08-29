package com.apinexus.registry.massive.digitaltree7638;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalTree7638Repository extends JpaRepository<DigitalTree7638, Long> {
    DigitalTree7638 findByName(String name);
}

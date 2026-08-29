package com.apinexus.registry.massive.digitaldatabase256;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalDatabase256Repository extends JpaRepository<DigitalDatabase256, Long> {
    DigitalDatabase256 findByName(String name);
}

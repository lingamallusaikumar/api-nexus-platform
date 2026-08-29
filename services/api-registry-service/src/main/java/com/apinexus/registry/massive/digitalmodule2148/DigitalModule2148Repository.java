package com.apinexus.registry.massive.digitalmodule2148;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalModule2148Repository extends JpaRepository<DigitalModule2148, Long> {
    DigitalModule2148 findByName(String name);
}

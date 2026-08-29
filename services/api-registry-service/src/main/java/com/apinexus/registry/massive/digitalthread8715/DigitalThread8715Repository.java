package com.apinexus.registry.massive.digitalthread8715;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalThread8715Repository extends JpaRepository<DigitalThread8715, Long> {
    DigitalThread8715 findByName(String name);
}

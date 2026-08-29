package com.apinexus.registry.massive.digitalsystem6821;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalSystem6821Repository extends JpaRepository<DigitalSystem6821, Long> {
    DigitalSystem6821 findByName(String name);
}

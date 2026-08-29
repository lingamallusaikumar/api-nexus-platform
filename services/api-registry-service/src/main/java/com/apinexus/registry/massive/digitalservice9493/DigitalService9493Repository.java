package com.apinexus.registry.massive.digitalservice9493;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalService9493Repository extends JpaRepository<DigitalService9493, Long> {
    DigitalService9493 findByName(String name);
}

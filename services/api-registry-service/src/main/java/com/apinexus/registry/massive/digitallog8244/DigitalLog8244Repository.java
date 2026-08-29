package com.apinexus.registry.massive.digitallog8244;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalLog8244Repository extends JpaRepository<DigitalLog8244, Long> {
    DigitalLog8244 findByName(String name);
}

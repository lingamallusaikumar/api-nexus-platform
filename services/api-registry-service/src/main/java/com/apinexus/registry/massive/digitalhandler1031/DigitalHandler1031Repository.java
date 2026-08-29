package com.apinexus.registry.massive.digitalhandler1031;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalHandler1031Repository extends JpaRepository<DigitalHandler1031, Long> {
    DigitalHandler1031 findByName(String name);
}

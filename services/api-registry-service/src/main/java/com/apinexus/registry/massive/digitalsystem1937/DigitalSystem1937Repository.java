package com.apinexus.registry.massive.digitalsystem1937;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalSystem1937Repository extends JpaRepository<DigitalSystem1937, Long> {
    DigitalSystem1937 findByName(String name);
}

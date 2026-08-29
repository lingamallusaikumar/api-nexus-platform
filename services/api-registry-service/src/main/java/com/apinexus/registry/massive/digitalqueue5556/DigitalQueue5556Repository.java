package com.apinexus.registry.massive.digitalqueue5556;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalQueue5556Repository extends JpaRepository<DigitalQueue5556, Long> {
    DigitalQueue5556 findByName(String name);
}

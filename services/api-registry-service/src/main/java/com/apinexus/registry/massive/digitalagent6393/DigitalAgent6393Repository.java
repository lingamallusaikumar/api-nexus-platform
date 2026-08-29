package com.apinexus.registry.massive.digitalagent6393;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalAgent6393Repository extends JpaRepository<DigitalAgent6393, Long> {
    DigitalAgent6393 findByName(String name);
}

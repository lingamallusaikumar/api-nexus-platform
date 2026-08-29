package com.apinexus.registry.massive.digitalstore6347;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalStore6347Repository extends JpaRepository<DigitalStore6347, Long> {
    DigitalStore6347 findByName(String name);
}

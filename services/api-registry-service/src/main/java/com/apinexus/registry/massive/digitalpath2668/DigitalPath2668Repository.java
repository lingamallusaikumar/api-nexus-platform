package com.apinexus.registry.massive.digitalpath2668;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalPath2668Repository extends JpaRepository<DigitalPath2668, Long> {
    DigitalPath2668 findByName(String name);
}

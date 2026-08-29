package com.apinexus.registry.massive.digitalqueue5619;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalQueue5619Repository extends JpaRepository<DigitalQueue5619, Long> {
    DigitalQueue5619 findByName(String name);
}

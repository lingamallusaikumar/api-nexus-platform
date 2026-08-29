package com.apinexus.registry.massive.digitalmap5332;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalMap5332Repository extends JpaRepository<DigitalMap5332, Long> {
    DigitalMap5332 findByName(String name);
}

package com.apinexus.registry.massive.physicalpool1940;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalPool1940Repository extends JpaRepository<PhysicalPool1940, Long> {
    PhysicalPool1940 findByName(String name);
}

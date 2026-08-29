package com.apinexus.registry.massive.physicalstack2066;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalStack2066Repository extends JpaRepository<PhysicalStack2066, Long> {
    PhysicalStack2066 findByName(String name);
}

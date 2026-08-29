package com.apinexus.registry.massive.physicalentry8281;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalEntry8281Repository extends JpaRepository<PhysicalEntry8281, Long> {
    PhysicalEntry8281 findByName(String name);
}

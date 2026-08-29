package com.apinexus.registry.massive.physicalsystem5836;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalSystem5836Repository extends JpaRepository<PhysicalSystem5836, Long> {
    PhysicalSystem5836 findByName(String name);
}

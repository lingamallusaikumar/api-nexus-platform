package com.apinexus.registry.massive.physicalmodule2024;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalModule2024Repository extends JpaRepository<PhysicalModule2024, Long> {
    PhysicalModule2024 findByName(String name);
}

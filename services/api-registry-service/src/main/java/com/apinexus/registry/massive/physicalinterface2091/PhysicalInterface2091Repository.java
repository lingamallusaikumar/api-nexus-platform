package com.apinexus.registry.massive.physicalinterface2091;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalInterface2091Repository extends JpaRepository<PhysicalInterface2091, Long> {
    PhysicalInterface2091 findByName(String name);
}

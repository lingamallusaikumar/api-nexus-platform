package com.apinexus.registry.massive.physicalset5541;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalSet5541Repository extends JpaRepository<PhysicalSet5541, Long> {
    PhysicalSet5541 findByName(String name);
}

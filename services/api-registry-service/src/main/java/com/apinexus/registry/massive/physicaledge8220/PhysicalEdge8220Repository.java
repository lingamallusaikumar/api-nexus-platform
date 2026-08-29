package com.apinexus.registry.massive.physicaledge8220;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalEdge8220Repository extends JpaRepository<PhysicalEdge8220, Long> {
    PhysicalEdge8220 findByName(String name);
}

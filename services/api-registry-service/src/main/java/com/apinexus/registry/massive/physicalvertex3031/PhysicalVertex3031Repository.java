package com.apinexus.registry.massive.physicalvertex3031;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalVertex3031Repository extends JpaRepository<PhysicalVertex3031, Long> {
    PhysicalVertex3031 findByName(String name);
}

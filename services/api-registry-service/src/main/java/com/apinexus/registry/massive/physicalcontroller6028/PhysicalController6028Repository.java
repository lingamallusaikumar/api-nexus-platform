package com.apinexus.registry.massive.physicalcontroller6028;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalController6028Repository extends JpaRepository<PhysicalController6028, Long> {
    PhysicalController6028 findByName(String name);
}

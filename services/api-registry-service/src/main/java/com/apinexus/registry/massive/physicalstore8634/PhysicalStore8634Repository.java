package com.apinexus.registry.massive.physicalstore8634;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalStore8634Repository extends JpaRepository<PhysicalStore8634, Long> {
    PhysicalStore8634 findByName(String name);
}

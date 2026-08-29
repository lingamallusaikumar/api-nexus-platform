package com.apinexus.registry.massive.physicalentry2987;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalEntry2987Repository extends JpaRepository<PhysicalEntry2987, Long> {
    PhysicalEntry2987 findByName(String name);
}

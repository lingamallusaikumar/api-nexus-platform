package com.apinexus.registry.massive.physicalportal2524;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalPortal2524Repository extends JpaRepository<PhysicalPortal2524, Long> {
    PhysicalPortal2524 findByName(String name);
}

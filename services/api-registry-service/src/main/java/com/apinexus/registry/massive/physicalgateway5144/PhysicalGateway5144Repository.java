package com.apinexus.registry.massive.physicalgateway5144;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalGateway5144Repository extends JpaRepository<PhysicalGateway5144, Long> {
    PhysicalGateway5144 findByName(String name);
}

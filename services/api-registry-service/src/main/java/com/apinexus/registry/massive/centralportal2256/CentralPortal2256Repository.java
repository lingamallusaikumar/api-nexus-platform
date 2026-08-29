package com.apinexus.registry.massive.centralportal2256;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralPortal2256Repository extends JpaRepository<CentralPortal2256, Long> {
    CentralPortal2256 findByName(String name);
}

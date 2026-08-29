package com.apinexus.registry.massive.centralnode3074;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralNode3074Repository extends JpaRepository<CentralNode3074, Long> {
    CentralNode3074 findByName(String name);
}

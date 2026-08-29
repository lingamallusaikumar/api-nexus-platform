package com.apinexus.registry.massive.centralpool2316;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralPool2316Repository extends JpaRepository<CentralPool2316, Long> {
    CentralPool2316 findByName(String name);
}

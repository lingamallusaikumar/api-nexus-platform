package com.apinexus.registry.massive.sectormanager9340;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorManager9340Repository extends JpaRepository<SectorManager9340, Long> {
    SectorManager9340 findByName(String name);
}

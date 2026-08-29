package com.apinexus.registry.massive.sectorqueue3856;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorQueue3856Repository extends JpaRepository<SectorQueue3856, Long> {
    SectorQueue3856 findByName(String name);
}

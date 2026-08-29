package com.apinexus.registry.massive.sectorqueue1679;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorQueue1679Repository extends JpaRepository<SectorQueue1679, Long> {
    SectorQueue1679 findByName(String name);
}

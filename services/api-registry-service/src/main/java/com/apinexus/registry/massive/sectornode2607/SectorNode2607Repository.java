package com.apinexus.registry.massive.sectornode2607;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorNode2607Repository extends JpaRepository<SectorNode2607, Long> {
    SectorNode2607 findByName(String name);
}

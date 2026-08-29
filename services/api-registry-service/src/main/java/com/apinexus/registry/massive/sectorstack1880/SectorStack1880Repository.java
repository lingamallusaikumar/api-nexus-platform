package com.apinexus.registry.massive.sectorstack1880;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorStack1880Repository extends JpaRepository<SectorStack1880, Long> {
    SectorStack1880 findByName(String name);
}

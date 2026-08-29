package com.apinexus.registry.massive.sectorqueue9657;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorQueue9657Repository extends JpaRepository<SectorQueue9657, Long> {
    SectorQueue9657 findByName(String name);
}

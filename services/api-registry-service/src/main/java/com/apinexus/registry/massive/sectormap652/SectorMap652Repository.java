package com.apinexus.registry.massive.sectormap652;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorMap652Repository extends JpaRepository<SectorMap652, Long> {
    SectorMap652 findByName(String name);
}

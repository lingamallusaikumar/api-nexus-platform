package com.apinexus.registry.massive.sectorarray8791;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorArray8791Repository extends JpaRepository<SectorArray8791, Long> {
    SectorArray8791 findByName(String name);
}

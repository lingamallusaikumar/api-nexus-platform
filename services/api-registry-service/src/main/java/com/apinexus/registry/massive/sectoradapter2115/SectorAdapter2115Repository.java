package com.apinexus.registry.massive.sectoradapter2115;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorAdapter2115Repository extends JpaRepository<SectorAdapter2115, Long> {
    SectorAdapter2115 findByName(String name);
}

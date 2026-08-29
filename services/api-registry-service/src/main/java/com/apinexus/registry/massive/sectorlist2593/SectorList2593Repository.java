package com.apinexus.registry.massive.sectorlist2593;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorList2593Repository extends JpaRepository<SectorList2593, Long> {
    SectorList2593 findByName(String name);
}

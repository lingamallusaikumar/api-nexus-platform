package com.apinexus.registry.massive.sectoritem7473;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorItem7473Repository extends JpaRepository<SectorItem7473, Long> {
    SectorItem7473 findByName(String name);
}

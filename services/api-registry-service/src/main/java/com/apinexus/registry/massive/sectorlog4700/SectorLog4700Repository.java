package com.apinexus.registry.massive.sectorlog4700;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorLog4700Repository extends JpaRepository<SectorLog4700, Long> {
    SectorLog4700 findByName(String name);
}

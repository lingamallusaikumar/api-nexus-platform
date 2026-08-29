package com.apinexus.registry.massive.sectorjob1652;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorJob1652Repository extends JpaRepository<SectorJob1652, Long> {
    SectorJob1652 findByName(String name);
}

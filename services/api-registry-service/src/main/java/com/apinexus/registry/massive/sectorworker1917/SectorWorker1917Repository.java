package com.apinexus.registry.massive.sectorworker1917;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorWorker1917Repository extends JpaRepository<SectorWorker1917, Long> {
    SectorWorker1917 findByName(String name);
}

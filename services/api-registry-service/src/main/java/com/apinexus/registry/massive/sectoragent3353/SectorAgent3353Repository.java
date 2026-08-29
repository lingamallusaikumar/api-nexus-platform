package com.apinexus.registry.massive.sectoragent3353;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorAgent3353Repository extends JpaRepository<SectorAgent3353, Long> {
    SectorAgent3353 findByName(String name);
}

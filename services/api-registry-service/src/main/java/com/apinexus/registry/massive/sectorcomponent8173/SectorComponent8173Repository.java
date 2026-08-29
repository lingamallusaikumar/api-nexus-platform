package com.apinexus.registry.massive.sectorcomponent8173;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorComponent8173Repository extends JpaRepository<SectorComponent8173, Long> {
    SectorComponent8173 findByName(String name);
}

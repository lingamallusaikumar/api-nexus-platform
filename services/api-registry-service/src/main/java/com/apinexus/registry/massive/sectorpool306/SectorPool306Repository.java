package com.apinexus.registry.massive.sectorpool306;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorPool306Repository extends JpaRepository<SectorPool306, Long> {
    SectorPool306 findByName(String name);
}

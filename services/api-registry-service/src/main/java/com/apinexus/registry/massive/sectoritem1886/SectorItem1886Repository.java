package com.apinexus.registry.massive.sectoritem1886;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorItem1886Repository extends JpaRepository<SectorItem1886, Long> {
    SectorItem1886 findByName(String name);
}

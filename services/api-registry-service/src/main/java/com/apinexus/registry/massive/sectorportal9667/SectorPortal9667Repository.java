package com.apinexus.registry.massive.sectorportal9667;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorPortal9667Repository extends JpaRepository<SectorPortal9667, Long> {
    SectorPortal9667 findByName(String name);
}

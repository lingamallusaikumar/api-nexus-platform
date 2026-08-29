package com.apinexus.registry.massive.zoneportal8808;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonePortal8808Repository extends JpaRepository<ZonePortal8808, Long> {
    ZonePortal8808 findByName(String name);
}

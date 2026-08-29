package com.apinexus.registry.massive.zoneitem2192;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneItem2192Repository extends JpaRepository<ZoneItem2192, Long> {
    ZoneItem2192 findByName(String name);
}

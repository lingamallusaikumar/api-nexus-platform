package com.apinexus.registry.massive.zoneitem2392;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneItem2392Repository extends JpaRepository<ZoneItem2392, Long> {
    ZoneItem2392 findByName(String name);
}

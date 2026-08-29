package com.apinexus.registry.massive.zonearray1468;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneArray1468Repository extends JpaRepository<ZoneArray1468, Long> {
    ZoneArray1468 findByName(String name);
}

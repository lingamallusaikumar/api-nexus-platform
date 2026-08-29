package com.apinexus.registry.massive.zoneitem1511;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneItem1511Repository extends JpaRepository<ZoneItem1511, Long> {
    ZoneItem1511 findByName(String name);
}

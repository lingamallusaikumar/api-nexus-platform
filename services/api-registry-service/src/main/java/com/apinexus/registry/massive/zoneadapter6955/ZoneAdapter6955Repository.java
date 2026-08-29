package com.apinexus.registry.massive.zoneadapter6955;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneAdapter6955Repository extends JpaRepository<ZoneAdapter6955, Long> {
    ZoneAdapter6955 findByName(String name);
}

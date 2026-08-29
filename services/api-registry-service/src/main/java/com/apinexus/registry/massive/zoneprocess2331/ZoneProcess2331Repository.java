package com.apinexus.registry.massive.zoneprocess2331;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneProcess2331Repository extends JpaRepository<ZoneProcess2331, Long> {
    ZoneProcess2331 findByName(String name);
}

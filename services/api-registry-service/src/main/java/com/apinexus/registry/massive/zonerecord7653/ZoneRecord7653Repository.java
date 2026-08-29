package com.apinexus.registry.massive.zonerecord7653;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRecord7653Repository extends JpaRepository<ZoneRecord7653, Long> {
    ZoneRecord7653 findByName(String name);
}

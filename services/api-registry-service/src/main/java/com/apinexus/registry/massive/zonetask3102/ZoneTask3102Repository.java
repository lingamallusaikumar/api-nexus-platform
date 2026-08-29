package com.apinexus.registry.massive.zonetask3102;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneTask3102Repository extends JpaRepository<ZoneTask3102, Long> {
    ZoneTask3102 findByName(String name);
}

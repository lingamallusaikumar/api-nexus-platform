package com.apinexus.registry.massive.zonerepo9196;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepo9196Repository extends JpaRepository<ZoneRepo9196, Long> {
    ZoneRepo9196 findByName(String name);
}

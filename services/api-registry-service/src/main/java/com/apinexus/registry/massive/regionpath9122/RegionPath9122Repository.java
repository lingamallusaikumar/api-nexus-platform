package com.apinexus.registry.massive.regionpath9122;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionPath9122Repository extends JpaRepository<RegionPath9122, Long> {
    RegionPath9122 findByName(String name);
}

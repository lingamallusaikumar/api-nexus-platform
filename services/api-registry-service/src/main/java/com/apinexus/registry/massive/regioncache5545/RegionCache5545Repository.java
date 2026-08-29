package com.apinexus.registry.massive.regioncache5545;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionCache5545Repository extends JpaRepository<RegionCache5545, Long> {
    RegionCache5545 findByName(String name);
}

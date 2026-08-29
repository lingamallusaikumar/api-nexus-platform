package com.apinexus.registry.massive.regionitem398;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionItem398Repository extends JpaRepository<RegionItem398, Long> {
    RegionItem398 findByName(String name);
}

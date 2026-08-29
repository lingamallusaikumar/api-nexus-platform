package com.apinexus.registry.massive.regionservice4828;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionService4828Repository extends JpaRepository<RegionService4828, Long> {
    RegionService4828 findByName(String name);
}

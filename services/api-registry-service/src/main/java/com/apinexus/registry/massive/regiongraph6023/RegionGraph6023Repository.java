package com.apinexus.registry.massive.regiongraph6023;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionGraph6023Repository extends JpaRepository<RegionGraph6023, Long> {
    RegionGraph6023 findByName(String name);
}

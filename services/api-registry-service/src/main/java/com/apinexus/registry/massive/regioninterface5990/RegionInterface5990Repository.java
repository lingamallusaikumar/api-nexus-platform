package com.apinexus.registry.massive.regioninterface5990;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionInterface5990Repository extends JpaRepository<RegionInterface5990, Long> {
    RegionInterface5990 findByName(String name);
}

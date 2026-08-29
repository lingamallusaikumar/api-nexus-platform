package com.apinexus.registry.massive.regionpath337;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionPath337Repository extends JpaRepository<RegionPath337, Long> {
    RegionPath337 findByName(String name);
}

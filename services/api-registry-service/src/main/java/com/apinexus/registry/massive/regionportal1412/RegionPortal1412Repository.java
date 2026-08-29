package com.apinexus.registry.massive.regionportal1412;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionPortal1412Repository extends JpaRepository<RegionPortal1412, Long> {
    RegionPortal1412 findByName(String name);
}

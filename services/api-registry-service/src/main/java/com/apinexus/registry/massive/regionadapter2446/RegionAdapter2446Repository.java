package com.apinexus.registry.massive.regionadapter2446;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionAdapter2446Repository extends JpaRepository<RegionAdapter2446, Long> {
    RegionAdapter2446 findByName(String name);
}

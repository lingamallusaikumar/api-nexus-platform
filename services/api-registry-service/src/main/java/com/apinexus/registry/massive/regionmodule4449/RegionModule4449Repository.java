package com.apinexus.registry.massive.regionmodule4449;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionModule4449Repository extends JpaRepository<RegionModule4449, Long> {
    RegionModule4449 findByName(String name);
}

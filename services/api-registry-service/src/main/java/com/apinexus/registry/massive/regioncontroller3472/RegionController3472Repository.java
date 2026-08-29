package com.apinexus.registry.massive.regioncontroller3472;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionController3472Repository extends JpaRepository<RegionController3472, Long> {
    RegionController3472 findByName(String name);
}

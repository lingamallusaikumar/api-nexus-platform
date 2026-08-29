package com.apinexus.registry.massive.regionflow5721;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionFlow5721Repository extends JpaRepository<RegionFlow5721, Long> {
    RegionFlow5721 findByName(String name);
}

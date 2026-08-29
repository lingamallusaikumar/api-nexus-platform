package com.apinexus.registry.massive.regionbroker6540;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionBroker6540Repository extends JpaRepository<RegionBroker6540, Long> {
    RegionBroker6540 findByName(String name);
}

package com.apinexus.registry.massive.regionbroker3868;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionBroker3868Repository extends JpaRepository<RegionBroker3868, Long> {
    RegionBroker3868 findByName(String name);
}

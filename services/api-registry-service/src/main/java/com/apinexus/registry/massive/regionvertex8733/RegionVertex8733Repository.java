package com.apinexus.registry.massive.regionvertex8733;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionVertex8733Repository extends JpaRepository<RegionVertex8733, Long> {
    RegionVertex8733 findByName(String name);
}

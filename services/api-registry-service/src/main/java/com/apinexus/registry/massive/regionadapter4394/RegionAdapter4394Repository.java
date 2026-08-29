package com.apinexus.registry.massive.regionadapter4394;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionAdapter4394Repository extends JpaRepository<RegionAdapter4394, Long> {
    RegionAdapter4394 findByName(String name);
}

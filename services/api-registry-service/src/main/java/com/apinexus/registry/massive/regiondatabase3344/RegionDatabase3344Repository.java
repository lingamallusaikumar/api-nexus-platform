package com.apinexus.registry.massive.regiondatabase3344;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionDatabase3344Repository extends JpaRepository<RegionDatabase3344, Long> {
    RegionDatabase3344 findByName(String name);
}

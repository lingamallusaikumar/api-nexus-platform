package com.apinexus.registry.massive.regionnode8386;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionNode8386Repository extends JpaRepository<RegionNode8386, Long> {
    RegionNode8386 findByName(String name);
}

package com.apinexus.registry.massive.zonejob4119;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneJob4119Repository extends JpaRepository<ZoneJob4119, Long> {
    ZoneJob4119 findByName(String name);
}

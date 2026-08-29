package com.apinexus.registry.massive.zonejob3883;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneJob3883Repository extends JpaRepository<ZoneJob3883, Long> {
    ZoneJob3883 findByName(String name);
}

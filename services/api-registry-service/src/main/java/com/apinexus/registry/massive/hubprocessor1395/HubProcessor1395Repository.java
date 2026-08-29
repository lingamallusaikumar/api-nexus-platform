package com.apinexus.registry.massive.hubprocessor1395;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubProcessor1395Repository extends JpaRepository<HubProcessor1395, Long> {
    HubProcessor1395 findByName(String name);
}

package com.apinexus.registry.massive.hubrecord5848;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubRecord5848Repository extends JpaRepository<HubRecord5848, Long> {
    HubRecord5848 findByName(String name);
}

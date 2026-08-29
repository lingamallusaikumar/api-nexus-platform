package com.apinexus.registry.massive.hubagent7659;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubAgent7659Repository extends JpaRepository<HubAgent7659, Long> {
    HubAgent7659 findByName(String name);
}

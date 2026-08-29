package com.apinexus.registry.massive.hubbridge2673;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubBridge2673Repository extends JpaRepository<HubBridge2673, Long> {
    HubBridge2673 findByName(String name);
}

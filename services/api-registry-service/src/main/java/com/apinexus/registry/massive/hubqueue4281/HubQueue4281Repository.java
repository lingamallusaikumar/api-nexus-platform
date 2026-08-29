package com.apinexus.registry.massive.hubqueue4281;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubQueue4281Repository extends JpaRepository<HubQueue4281, Long> {
    HubQueue4281 findByName(String name);
}

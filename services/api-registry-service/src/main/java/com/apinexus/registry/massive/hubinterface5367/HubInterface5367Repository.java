package com.apinexus.registry.massive.hubinterface5367;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubInterface5367Repository extends JpaRepository<HubInterface5367, Long> {
    HubInterface5367 findByName(String name);
}

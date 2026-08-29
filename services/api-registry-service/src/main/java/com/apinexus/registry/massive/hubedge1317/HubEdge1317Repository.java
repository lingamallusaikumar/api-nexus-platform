package com.apinexus.registry.massive.hubedge1317;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubEdge1317Repository extends JpaRepository<HubEdge1317, Long> {
    HubEdge1317 findByName(String name);
}

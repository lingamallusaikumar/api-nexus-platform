package com.apinexus.registry.massive.hubvertex9968;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubVertex9968Repository extends JpaRepository<HubVertex9968, Long> {
    HubVertex9968 findByName(String name);
}

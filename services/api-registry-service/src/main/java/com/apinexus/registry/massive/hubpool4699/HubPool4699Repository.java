package com.apinexus.registry.massive.hubpool4699;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubPool4699Repository extends JpaRepository<HubPool4699, Long> {
    HubPool4699 findByName(String name);
}

package com.apinexus.registry.massive.hubstore561;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubStore561Repository extends JpaRepository<HubStore561, Long> {
    HubStore561 findByName(String name);
}

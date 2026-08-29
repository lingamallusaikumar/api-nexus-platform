package com.apinexus.registry.massive.hubmap5864;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubMap5864Repository extends JpaRepository<HubMap5864, Long> {
    HubMap5864 findByName(String name);
}

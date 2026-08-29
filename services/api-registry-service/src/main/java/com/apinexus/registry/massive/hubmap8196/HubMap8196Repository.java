package com.apinexus.registry.massive.hubmap8196;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubMap8196Repository extends JpaRepository<HubMap8196, Long> {
    HubMap8196 findByName(String name);
}

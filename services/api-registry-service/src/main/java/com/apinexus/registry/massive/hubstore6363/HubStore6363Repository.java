package com.apinexus.registry.massive.hubstore6363;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubStore6363Repository extends JpaRepository<HubStore6363, Long> {
    HubStore6363 findByName(String name);
}

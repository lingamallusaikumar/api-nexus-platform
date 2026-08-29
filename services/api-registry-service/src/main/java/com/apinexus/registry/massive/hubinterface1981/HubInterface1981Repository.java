package com.apinexus.registry.massive.hubinterface1981;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubInterface1981Repository extends JpaRepository<HubInterface1981, Long> {
    HubInterface1981 findByName(String name);
}

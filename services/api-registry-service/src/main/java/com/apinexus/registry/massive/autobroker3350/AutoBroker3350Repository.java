package com.apinexus.registry.massive.autobroker3350;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoBroker3350Repository extends JpaRepository<AutoBroker3350, Long> {
    AutoBroker3350 findByName(String name);
}

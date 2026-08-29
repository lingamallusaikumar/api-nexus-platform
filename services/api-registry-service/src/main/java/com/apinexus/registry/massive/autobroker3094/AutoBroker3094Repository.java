package com.apinexus.registry.massive.autobroker3094;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoBroker3094Repository extends JpaRepository<AutoBroker3094, Long> {
    AutoBroker3094 findByName(String name);
}

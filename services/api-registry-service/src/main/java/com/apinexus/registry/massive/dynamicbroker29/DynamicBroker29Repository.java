package com.apinexus.registry.massive.dynamicbroker29;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicBroker29Repository extends JpaRepository<DynamicBroker29, Long> {
    DynamicBroker29 findByName(String name);
}

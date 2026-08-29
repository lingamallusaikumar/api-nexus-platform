package com.apinexus.registry.massive.dynamicbroker7712;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicBroker7712Repository extends JpaRepository<DynamicBroker7712, Long> {
    DynamicBroker7712 findByName(String name);
}

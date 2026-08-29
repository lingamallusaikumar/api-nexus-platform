package com.apinexus.registry.massive.switchbroker2974;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchBroker2974Repository extends JpaRepository<SwitchBroker2974, Long> {
    SwitchBroker2974 findByName(String name);
}

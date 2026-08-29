package com.apinexus.registry.massive.switchbridge8846;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchBridge8846Repository extends JpaRepository<SwitchBridge8846, Long> {
    SwitchBridge8846 findByName(String name);
}

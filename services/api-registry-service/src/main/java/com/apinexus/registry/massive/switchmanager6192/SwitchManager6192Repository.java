package com.apinexus.registry.massive.switchmanager6192;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchManager6192Repository extends JpaRepository<SwitchManager6192, Long> {
    SwitchManager6192 findByName(String name);
}

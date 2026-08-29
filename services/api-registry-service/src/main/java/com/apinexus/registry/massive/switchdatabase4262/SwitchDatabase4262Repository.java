package com.apinexus.registry.massive.switchdatabase4262;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchDatabase4262Repository extends JpaRepository<SwitchDatabase4262, Long> {
    SwitchDatabase4262 findByName(String name);
}

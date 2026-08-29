package com.apinexus.registry.massive.switchmap2408;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchMap2408Repository extends JpaRepository<SwitchMap2408, Long> {
    SwitchMap2408 findByName(String name);
}

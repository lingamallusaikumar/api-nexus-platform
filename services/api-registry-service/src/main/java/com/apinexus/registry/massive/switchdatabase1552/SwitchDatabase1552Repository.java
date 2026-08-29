package com.apinexus.registry.massive.switchdatabase1552;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchDatabase1552Repository extends JpaRepository<SwitchDatabase1552, Long> {
    SwitchDatabase1552 findByName(String name);
}

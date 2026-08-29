package com.apinexus.registry.massive.switchsystem5550;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchSystem5550Repository extends JpaRepository<SwitchSystem5550, Long> {
    SwitchSystem5550 findByName(String name);
}

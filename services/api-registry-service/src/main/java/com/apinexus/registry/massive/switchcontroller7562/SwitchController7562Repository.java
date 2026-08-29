package com.apinexus.registry.massive.switchcontroller7562;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchController7562Repository extends JpaRepository<SwitchController7562, Long> {
    SwitchController7562 findByName(String name);
}

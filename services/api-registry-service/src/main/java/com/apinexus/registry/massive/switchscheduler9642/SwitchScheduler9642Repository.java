package com.apinexus.registry.massive.switchscheduler9642;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchScheduler9642Repository extends JpaRepository<SwitchScheduler9642, Long> {
    SwitchScheduler9642 findByName(String name);
}

package com.apinexus.registry.massive.switchdispatcher3030;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchDispatcher3030Repository extends JpaRepository<SwitchDispatcher3030, Long> {
    SwitchDispatcher3030 findByName(String name);
}

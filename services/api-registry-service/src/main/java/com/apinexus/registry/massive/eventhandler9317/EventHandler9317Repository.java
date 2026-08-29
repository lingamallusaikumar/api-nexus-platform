package com.apinexus.registry.massive.eventhandler9317;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventHandler9317Repository extends JpaRepository<EventHandler9317, Long> {
    EventHandler9317 findByName(String name);
}

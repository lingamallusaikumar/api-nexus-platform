package com.apinexus.registry.massive.eventhandler5827;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventHandler5827Repository extends JpaRepository<EventHandler5827, Long> {
    EventHandler5827 findByName(String name);
}

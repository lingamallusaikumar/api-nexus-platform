package com.apinexus.registry.massive.eventprocessor6262;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventProcessor6262Repository extends JpaRepository<EventProcessor6262, Long> {
    EventProcessor6262 findByName(String name);
}

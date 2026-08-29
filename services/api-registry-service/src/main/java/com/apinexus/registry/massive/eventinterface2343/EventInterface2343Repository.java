package com.apinexus.registry.massive.eventinterface2343;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventInterface2343Repository extends JpaRepository<EventInterface2343, Long> {
    EventInterface2343 findByName(String name);
}

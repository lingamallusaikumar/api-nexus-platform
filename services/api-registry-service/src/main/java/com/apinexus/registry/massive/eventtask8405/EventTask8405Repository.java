package com.apinexus.registry.massive.eventtask8405;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTask8405Repository extends JpaRepository<EventTask8405, Long> {
    EventTask8405 findByName(String name);
}

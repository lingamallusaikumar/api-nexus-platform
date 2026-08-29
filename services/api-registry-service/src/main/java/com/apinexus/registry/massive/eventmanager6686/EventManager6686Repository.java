package com.apinexus.registry.massive.eventmanager6686;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventManager6686Repository extends JpaRepository<EventManager6686, Long> {
    EventManager6686 findByName(String name);
}

package com.apinexus.registry.massive.eventsystem8174;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventSystem8174Repository extends JpaRepository<EventSystem8174, Long> {
    EventSystem8174 findByName(String name);
}

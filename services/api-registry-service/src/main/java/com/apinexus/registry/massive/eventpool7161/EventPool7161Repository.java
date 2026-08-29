package com.apinexus.registry.massive.eventpool7161;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventPool7161Repository extends JpaRepository<EventPool7161, Long> {
    EventPool7161 findByName(String name);
}

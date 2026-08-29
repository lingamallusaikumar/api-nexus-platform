package com.apinexus.registry.massive.eventbridge4406;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventBridge4406Repository extends JpaRepository<EventBridge4406, Long> {
    EventBridge4406 findByName(String name);
}

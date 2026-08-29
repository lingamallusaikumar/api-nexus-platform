package com.apinexus.registry.massive.eventedge8155;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventEdge8155Repository extends JpaRepository<EventEdge8155, Long> {
    EventEdge8155 findByName(String name);
}

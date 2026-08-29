package com.apinexus.registry.massive.eventadapter3754;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventAdapter3754Repository extends JpaRepository<EventAdapter3754, Long> {
    EventAdapter3754 findByName(String name);
}

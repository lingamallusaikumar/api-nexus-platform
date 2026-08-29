package com.apinexus.registry.massive.eventvertex2885;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventVertex2885Repository extends JpaRepository<EventVertex2885, Long> {
    EventVertex2885 findByName(String name);
}

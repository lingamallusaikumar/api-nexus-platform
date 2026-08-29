package com.apinexus.registry.massive.eventnode4898;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventNode4898Repository extends JpaRepository<EventNode4898, Long> {
    EventNode4898 findByName(String name);
}

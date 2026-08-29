package com.apinexus.registry.massive.eventarray8323;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventArray8323Repository extends JpaRepository<EventArray8323, Long> {
    EventArray8323 findByName(String name);
}

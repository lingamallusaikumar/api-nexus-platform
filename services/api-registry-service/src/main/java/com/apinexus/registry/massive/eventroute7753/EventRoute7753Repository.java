package com.apinexus.registry.massive.eventroute7753;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRoute7753Repository extends JpaRepository<EventRoute7753, Long> {
    EventRoute7753 findByName(String name);
}

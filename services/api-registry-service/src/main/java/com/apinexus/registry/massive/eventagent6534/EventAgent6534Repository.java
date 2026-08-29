package com.apinexus.registry.massive.eventagent6534;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventAgent6534Repository extends JpaRepository<EventAgent6534, Long> {
    EventAgent6534 findByName(String name);
}

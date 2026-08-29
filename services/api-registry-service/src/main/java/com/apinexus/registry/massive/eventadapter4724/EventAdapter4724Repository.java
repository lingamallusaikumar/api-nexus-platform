package com.apinexus.registry.massive.eventadapter4724;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventAdapter4724Repository extends JpaRepository<EventAdapter4724, Long> {
    EventAdapter4724 findByName(String name);
}

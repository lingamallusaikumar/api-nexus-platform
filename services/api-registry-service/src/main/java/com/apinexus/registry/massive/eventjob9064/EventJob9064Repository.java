package com.apinexus.registry.massive.eventjob9064;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventJob9064Repository extends JpaRepository<EventJob9064, Long> {
    EventJob9064 findByName(String name);
}

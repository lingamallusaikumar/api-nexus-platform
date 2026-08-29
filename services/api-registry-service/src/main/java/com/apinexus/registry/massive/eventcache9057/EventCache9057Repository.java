package com.apinexus.registry.massive.eventcache9057;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCache9057Repository extends JpaRepository<EventCache9057, Long> {
    EventCache9057 findByName(String name);
}

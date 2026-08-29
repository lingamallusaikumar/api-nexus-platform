package com.apinexus.registry.massive.hubdispatcher9156;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubDispatcher9156Repository extends JpaRepository<HubDispatcher9156, Long> {
    HubDispatcher9156 findByName(String name);
}

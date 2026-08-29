package com.apinexus.registry.massive.realtimequeue2226;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeQueue2226Repository extends JpaRepository<RealtimeQueue2226, Long> {
    RealtimeQueue2226 findByName(String name);
}

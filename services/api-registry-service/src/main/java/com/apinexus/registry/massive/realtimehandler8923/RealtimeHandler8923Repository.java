package com.apinexus.registry.massive.realtimehandler8923;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeHandler8923Repository extends JpaRepository<RealtimeHandler8923, Long> {
    RealtimeHandler8923 findByName(String name);
}

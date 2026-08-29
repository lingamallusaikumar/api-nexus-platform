package com.apinexus.registry.massive.realtimebuffer1572;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeBuffer1572Repository extends JpaRepository<RealtimeBuffer1572, Long> {
    RealtimeBuffer1572 findByName(String name);
}

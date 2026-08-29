package com.apinexus.registry.massive.realtimethread1137;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeThread1137Repository extends JpaRepository<RealtimeThread1137, Long> {
    RealtimeThread1137 findByName(String name);
}

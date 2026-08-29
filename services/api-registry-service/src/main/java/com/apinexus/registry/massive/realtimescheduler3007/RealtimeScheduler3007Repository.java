package com.apinexus.registry.massive.realtimescheduler3007;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeScheduler3007Repository extends JpaRepository<RealtimeScheduler3007, Long> {
    RealtimeScheduler3007 findByName(String name);
}

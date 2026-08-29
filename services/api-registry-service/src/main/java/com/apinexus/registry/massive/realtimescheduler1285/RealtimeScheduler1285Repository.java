package com.apinexus.registry.massive.realtimescheduler1285;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeScheduler1285Repository extends JpaRepository<RealtimeScheduler1285, Long> {
    RealtimeScheduler1285 findByName(String name);
}

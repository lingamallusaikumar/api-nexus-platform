package com.apinexus.registry.massive.realtimeworker2746;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeWorker2746Repository extends JpaRepository<RealtimeWorker2746, Long> {
    RealtimeWorker2746 findByName(String name);
}

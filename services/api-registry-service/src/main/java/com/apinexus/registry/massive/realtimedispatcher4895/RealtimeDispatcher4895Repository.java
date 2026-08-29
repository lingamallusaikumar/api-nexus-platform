package com.apinexus.registry.massive.realtimedispatcher4895;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeDispatcher4895Repository extends JpaRepository<RealtimeDispatcher4895, Long> {
    RealtimeDispatcher4895 findByName(String name);
}

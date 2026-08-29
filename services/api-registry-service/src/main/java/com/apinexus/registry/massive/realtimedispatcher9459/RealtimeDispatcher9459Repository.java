package com.apinexus.registry.massive.realtimedispatcher9459;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeDispatcher9459Repository extends JpaRepository<RealtimeDispatcher9459, Long> {
    RealtimeDispatcher9459 findByName(String name);
}

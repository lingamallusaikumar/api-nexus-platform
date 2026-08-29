package com.apinexus.registry.massive.realtimequeue4770;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeQueue4770Repository extends JpaRepository<RealtimeQueue4770, Long> {
    RealtimeQueue4770 findByName(String name);
}

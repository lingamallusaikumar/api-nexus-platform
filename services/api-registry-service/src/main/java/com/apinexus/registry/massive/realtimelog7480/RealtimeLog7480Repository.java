package com.apinexus.registry.massive.realtimelog7480;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeLog7480Repository extends JpaRepository<RealtimeLog7480, Long> {
    RealtimeLog7480 findByName(String name);
}

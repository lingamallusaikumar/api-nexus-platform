package com.apinexus.registry.massive.realtimethread9378;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeThread9378Repository extends JpaRepository<RealtimeThread9378, Long> {
    RealtimeThread9378 findByName(String name);
}

package com.apinexus.registry.massive.streamscheduler8548;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamScheduler8548Repository extends JpaRepository<StreamScheduler8548, Long> {
    StreamScheduler8548 findByName(String name);
}

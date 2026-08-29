package com.apinexus.registry.massive.cyberscheduler2778;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberScheduler2778Repository extends JpaRepository<CyberScheduler2778, Long> {
    CyberScheduler2778 findByName(String name);
}

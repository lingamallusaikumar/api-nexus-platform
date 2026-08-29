package com.apinexus.registry.massive.centralscheduler4185;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralScheduler4185Repository extends JpaRepository<CentralScheduler4185, Long> {
    CentralScheduler4185 findByName(String name);
}

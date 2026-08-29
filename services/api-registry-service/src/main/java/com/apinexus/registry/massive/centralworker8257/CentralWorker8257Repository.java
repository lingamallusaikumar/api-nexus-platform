package com.apinexus.registry.massive.centralworker8257;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralWorker8257Repository extends JpaRepository<CentralWorker8257, Long> {
    CentralWorker8257 findByName(String name);
}

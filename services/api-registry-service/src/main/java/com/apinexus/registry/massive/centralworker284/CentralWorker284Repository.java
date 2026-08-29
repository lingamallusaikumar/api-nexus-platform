package com.apinexus.registry.massive.centralworker284;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralWorker284Repository extends JpaRepository<CentralWorker284, Long> {
    CentralWorker284 findByName(String name);
}

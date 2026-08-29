package com.apinexus.registry.massive.quantumworker2432;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumWorker2432Repository extends JpaRepository<QuantumWorker2432, Long> {
    QuantumWorker2432 findByName(String name);
}

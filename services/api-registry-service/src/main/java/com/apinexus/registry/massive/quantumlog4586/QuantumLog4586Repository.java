package com.apinexus.registry.massive.quantumlog4586;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumLog4586Repository extends JpaRepository<QuantumLog4586, Long> {
    QuantumLog4586 findByName(String name);
}

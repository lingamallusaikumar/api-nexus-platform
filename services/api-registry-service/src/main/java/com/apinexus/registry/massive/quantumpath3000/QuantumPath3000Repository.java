package com.apinexus.registry.massive.quantumpath3000;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumPath3000Repository extends JpaRepository<QuantumPath3000, Long> {
    QuantumPath3000 findByName(String name);
}

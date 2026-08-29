package com.apinexus.registry.massive.quantummap4106;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumMap4106Repository extends JpaRepository<QuantumMap4106, Long> {
    QuantumMap4106 findByName(String name);
}

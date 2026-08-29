package com.apinexus.registry.massive.quantumledger4591;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumLedger4591Repository extends JpaRepository<QuantumLedger4591, Long> {
    QuantumLedger4591 findByName(String name);
}

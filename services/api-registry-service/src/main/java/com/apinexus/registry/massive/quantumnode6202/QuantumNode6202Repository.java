package com.apinexus.registry.massive.quantumnode6202;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumNode6202Repository extends JpaRepository<QuantumNode6202, Long> {
    QuantumNode6202 findByName(String name);
}

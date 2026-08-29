package com.apinexus.registry.massive.quantumentry9190;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumEntry9190Repository extends JpaRepository<QuantumEntry9190, Long> {
    QuantumEntry9190 findByName(String name);
}

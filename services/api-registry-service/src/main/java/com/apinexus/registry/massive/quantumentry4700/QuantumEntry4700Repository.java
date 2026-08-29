package com.apinexus.registry.massive.quantumentry4700;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumEntry4700Repository extends JpaRepository<QuantumEntry4700, Long> {
    QuantumEntry4700 findByName(String name);
}

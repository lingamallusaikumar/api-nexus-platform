package com.apinexus.registry.massive.quantummanager1844;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumManager1844Repository extends JpaRepository<QuantumManager1844, Long> {
    QuantumManager1844 findByName(String name);
}

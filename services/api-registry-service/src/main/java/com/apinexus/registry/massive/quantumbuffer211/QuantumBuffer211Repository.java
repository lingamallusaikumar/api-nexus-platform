package com.apinexus.registry.massive.quantumbuffer211;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumBuffer211Repository extends JpaRepository<QuantumBuffer211, Long> {
    QuantumBuffer211 findByName(String name);
}

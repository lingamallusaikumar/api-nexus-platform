package com.apinexus.registry.massive.quantumgateway3023;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumGateway3023Repository extends JpaRepository<QuantumGateway3023, Long> {
    QuantumGateway3023 findByName(String name);
}

package com.apinexus.registry.massive.quantummanager4514;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantumManager4514Repository extends JpaRepository<QuantumManager4514, Long> {
    QuantumManager4514 findByName(String name);
}

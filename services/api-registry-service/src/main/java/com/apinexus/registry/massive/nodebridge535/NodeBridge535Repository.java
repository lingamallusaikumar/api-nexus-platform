package com.apinexus.registry.massive.nodebridge535;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeBridge535Repository extends JpaRepository<NodeBridge535, Long> {
    NodeBridge535 findByName(String name);
}

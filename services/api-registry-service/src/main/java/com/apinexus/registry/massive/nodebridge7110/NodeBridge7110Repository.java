package com.apinexus.registry.massive.nodebridge7110;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeBridge7110Repository extends JpaRepository<NodeBridge7110, Long> {
    NodeBridge7110 findByName(String name);
}

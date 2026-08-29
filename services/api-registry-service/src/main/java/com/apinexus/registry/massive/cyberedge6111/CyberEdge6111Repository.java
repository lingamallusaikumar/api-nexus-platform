package com.apinexus.registry.massive.cyberedge6111;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberEdge6111Repository extends JpaRepository<CyberEdge6111, Long> {
    CyberEdge6111 findByName(String name);
}

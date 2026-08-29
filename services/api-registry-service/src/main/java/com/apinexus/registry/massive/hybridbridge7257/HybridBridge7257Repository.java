package com.apinexus.registry.massive.hybridbridge7257;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridBridge7257Repository extends JpaRepository<HybridBridge7257, Long> {
    HybridBridge7257 findByName(String name);
}

package com.apinexus.registry.massive.hybridmap9701;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridMap9701Repository extends JpaRepository<HybridMap9701, Long> {
    HybridMap9701 findByName(String name);
}

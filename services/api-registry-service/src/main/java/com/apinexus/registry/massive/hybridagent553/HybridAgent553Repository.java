package com.apinexus.registry.massive.hybridagent553;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridAgent553Repository extends JpaRepository<HybridAgent553, Long> {
    HybridAgent553 findByName(String name);
}

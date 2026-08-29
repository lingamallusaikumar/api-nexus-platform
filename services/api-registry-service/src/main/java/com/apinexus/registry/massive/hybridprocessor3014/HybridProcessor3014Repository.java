package com.apinexus.registry.massive.hybridprocessor3014;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridProcessor3014Repository extends JpaRepository<HybridProcessor3014, Long> {
    HybridProcessor3014 findByName(String name);
}

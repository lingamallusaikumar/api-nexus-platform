package com.apinexus.registry.massive.cyberqueue4318;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberQueue4318Repository extends JpaRepository<CyberQueue4318, Long> {
    CyberQueue4318 findByName(String name);
}

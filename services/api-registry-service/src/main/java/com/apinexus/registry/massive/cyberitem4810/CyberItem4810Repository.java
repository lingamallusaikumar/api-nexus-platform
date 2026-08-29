package com.apinexus.registry.massive.cyberitem4810;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberItem4810Repository extends JpaRepository<CyberItem4810, Long> {
    CyberItem4810 findByName(String name);
}

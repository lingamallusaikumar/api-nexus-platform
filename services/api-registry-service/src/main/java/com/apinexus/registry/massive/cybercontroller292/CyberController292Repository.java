package com.apinexus.registry.massive.cybercontroller292;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberController292Repository extends JpaRepository<CyberController292, Long> {
    CyberController292 findByName(String name);
}

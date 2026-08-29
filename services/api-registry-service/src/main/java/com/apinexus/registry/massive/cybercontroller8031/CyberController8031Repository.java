package com.apinexus.registry.massive.cybercontroller8031;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberController8031Repository extends JpaRepository<CyberController8031, Long> {
    CyberController8031 findByName(String name);
}

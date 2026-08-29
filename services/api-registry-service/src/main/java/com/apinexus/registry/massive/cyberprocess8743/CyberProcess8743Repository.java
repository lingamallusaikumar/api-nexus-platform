package com.apinexus.registry.massive.cyberprocess8743;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberProcess8743Repository extends JpaRepository<CyberProcess8743, Long> {
    CyberProcess8743 findByName(String name);
}

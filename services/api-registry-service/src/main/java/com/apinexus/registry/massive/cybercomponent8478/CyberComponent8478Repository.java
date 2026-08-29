package com.apinexus.registry.massive.cybercomponent8478;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberComponent8478Repository extends JpaRepository<CyberComponent8478, Long> {
    CyberComponent8478 findByName(String name);
}

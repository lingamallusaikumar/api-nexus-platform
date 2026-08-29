package com.apinexus.registry.massive.cyberinterface4874;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberInterface4874Repository extends JpaRepository<CyberInterface4874, Long> {
    CyberInterface4874 findByName(String name);
}

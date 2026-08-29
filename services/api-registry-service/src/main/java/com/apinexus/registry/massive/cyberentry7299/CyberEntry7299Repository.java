package com.apinexus.registry.massive.cyberentry7299;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberEntry7299Repository extends JpaRepository<CyberEntry7299, Long> {
    CyberEntry7299 findByName(String name);
}

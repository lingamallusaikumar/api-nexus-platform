package com.apinexus.registry.massive.cyberentry7981;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberEntry7981Repository extends JpaRepository<CyberEntry7981, Long> {
    CyberEntry7981 findByName(String name);
}

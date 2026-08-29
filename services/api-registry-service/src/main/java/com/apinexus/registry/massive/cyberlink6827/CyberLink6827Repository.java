package com.apinexus.registry.massive.cyberlink6827;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberLink6827Repository extends JpaRepository<CyberLink6827, Long> {
    CyberLink6827 findByName(String name);
}

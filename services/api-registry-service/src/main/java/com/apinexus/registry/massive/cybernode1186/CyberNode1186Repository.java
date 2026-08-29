package com.apinexus.registry.massive.cybernode1186;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberNode1186Repository extends JpaRepository<CyberNode1186, Long> {
    CyberNode1186 findByName(String name);
}

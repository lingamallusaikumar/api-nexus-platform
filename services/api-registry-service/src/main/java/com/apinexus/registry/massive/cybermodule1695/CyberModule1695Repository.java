package com.apinexus.registry.massive.cybermodule1695;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberModule1695Repository extends JpaRepository<CyberModule1695, Long> {
    CyberModule1695 findByName(String name);
}

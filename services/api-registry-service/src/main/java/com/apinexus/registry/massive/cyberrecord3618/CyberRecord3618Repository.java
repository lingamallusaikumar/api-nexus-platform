package com.apinexus.registry.massive.cyberrecord3618;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberRecord3618Repository extends JpaRepository<CyberRecord3618, Long> {
    CyberRecord3618 findByName(String name);
}

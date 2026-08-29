package com.apinexus.registry.massive.cyberadapter5487;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberAdapter5487Repository extends JpaRepository<CyberAdapter5487, Long> {
    CyberAdapter5487 findByName(String name);
}

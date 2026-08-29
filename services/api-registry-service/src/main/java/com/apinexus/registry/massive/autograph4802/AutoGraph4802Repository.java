package com.apinexus.registry.massive.autograph4802;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoGraph4802Repository extends JpaRepository<AutoGraph4802, Long> {
    AutoGraph4802 findByName(String name);
}

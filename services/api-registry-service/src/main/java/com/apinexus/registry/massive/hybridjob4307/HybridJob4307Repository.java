package com.apinexus.registry.massive.hybridjob4307;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridJob4307Repository extends JpaRepository<HybridJob4307, Long> {
    HybridJob4307 findByName(String name);
}

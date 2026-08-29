package com.apinexus.registry.massive.hybridstore5599;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridStore5599Repository extends JpaRepository<HybridStore5599, Long> {
    HybridStore5599 findByName(String name);
}

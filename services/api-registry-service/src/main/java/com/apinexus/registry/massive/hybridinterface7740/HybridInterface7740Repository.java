package com.apinexus.registry.massive.hybridinterface7740;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridInterface7740Repository extends JpaRepository<HybridInterface7740, Long> {
    HybridInterface7740 findByName(String name);
}

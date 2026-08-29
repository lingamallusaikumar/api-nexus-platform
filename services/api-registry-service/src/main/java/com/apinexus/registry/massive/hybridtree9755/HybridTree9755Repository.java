package com.apinexus.registry.massive.hybridtree9755;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridTree9755Repository extends JpaRepository<HybridTree9755, Long> {
    HybridTree9755 findByName(String name);
}

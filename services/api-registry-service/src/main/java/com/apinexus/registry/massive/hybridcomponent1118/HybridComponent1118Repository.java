package com.apinexus.registry.massive.hybridcomponent1118;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridComponent1118Repository extends JpaRepository<HybridComponent1118, Long> {
    HybridComponent1118 findByName(String name);
}

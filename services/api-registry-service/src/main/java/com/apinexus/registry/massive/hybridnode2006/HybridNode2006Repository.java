package com.apinexus.registry.massive.hybridnode2006;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridNode2006Repository extends JpaRepository<HybridNode2006, Long> {
    HybridNode2006 findByName(String name);
}

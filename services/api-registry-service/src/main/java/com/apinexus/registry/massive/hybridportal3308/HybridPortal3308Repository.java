package com.apinexus.registry.massive.hybridportal3308;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridPortal3308Repository extends JpaRepository<HybridPortal3308, Long> {
    HybridPortal3308 findByName(String name);
}

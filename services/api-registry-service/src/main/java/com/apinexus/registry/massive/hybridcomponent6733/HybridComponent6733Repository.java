package com.apinexus.registry.massive.hybridcomponent6733;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridComponent6733Repository extends JpaRepository<HybridComponent6733, Long> {
    HybridComponent6733 findByName(String name);
}

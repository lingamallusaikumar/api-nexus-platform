package com.apinexus.registry.massive.hybridlog5380;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridLog5380Repository extends JpaRepository<HybridLog5380, Long> {
    HybridLog5380 findByName(String name);
}

package com.apinexus.registry.massive.hybridcontroller6044;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridController6044Repository extends JpaRepository<HybridController6044, Long> {
    HybridController6044 findByName(String name);
}

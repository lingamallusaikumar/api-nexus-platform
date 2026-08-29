package com.apinexus.registry.massive.sectorgraph2636;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorGraph2636Repository extends JpaRepository<SectorGraph2636, Long> {
    SectorGraph2636 findByName(String name);
}

package com.apinexus.registry.massive.hybridsystem7087;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridSystem7087Repository extends JpaRepository<HybridSystem7087, Long> {
    HybridSystem7087 findByName(String name);
}

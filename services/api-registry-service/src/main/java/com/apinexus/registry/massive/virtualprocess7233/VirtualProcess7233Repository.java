package com.apinexus.registry.massive.virtualprocess7233;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualProcess7233Repository extends JpaRepository<VirtualProcess7233, Long> {
    VirtualProcess7233 findByName(String name);
}

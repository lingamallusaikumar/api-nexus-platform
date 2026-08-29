package com.apinexus.registry.massive.virtualcache216;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualCache216Repository extends JpaRepository<VirtualCache216, Long> {
    VirtualCache216 findByName(String name);
}

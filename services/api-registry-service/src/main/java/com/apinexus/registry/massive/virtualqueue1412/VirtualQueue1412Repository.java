package com.apinexus.registry.massive.virtualqueue1412;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualQueue1412Repository extends JpaRepository<VirtualQueue1412, Long> {
    VirtualQueue1412 findByName(String name);
}

package com.apinexus.registry.massive.virtualqueue9508;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualQueue9508Repository extends JpaRepository<VirtualQueue9508, Long> {
    VirtualQueue9508 findByName(String name);
}

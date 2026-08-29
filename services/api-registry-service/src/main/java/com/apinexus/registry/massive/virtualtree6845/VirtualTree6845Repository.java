package com.apinexus.registry.massive.virtualtree6845;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualTree6845Repository extends JpaRepository<VirtualTree6845, Long> {
    VirtualTree6845 findByName(String name);
}

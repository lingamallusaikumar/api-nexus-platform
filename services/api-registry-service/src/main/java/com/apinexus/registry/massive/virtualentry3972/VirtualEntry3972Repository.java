package com.apinexus.registry.massive.virtualentry3972;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualEntry3972Repository extends JpaRepository<VirtualEntry3972, Long> {
    VirtualEntry3972 findByName(String name);
}

package com.apinexus.registry.massive.virtualengine9696;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualEngine9696Repository extends JpaRepository<VirtualEngine9696, Long> {
    VirtualEngine9696 findByName(String name);
}

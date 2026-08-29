package com.apinexus.registry.massive.virtuallog465;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualLog465Repository extends JpaRepository<VirtualLog465, Long> {
    VirtualLog465 findByName(String name);
}

package com.apinexus.registry.massive.virtualcontroller8117;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualController8117Repository extends JpaRepository<VirtualController8117, Long> {
    VirtualController8117 findByName(String name);
}

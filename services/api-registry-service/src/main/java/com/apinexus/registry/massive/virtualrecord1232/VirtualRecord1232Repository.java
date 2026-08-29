package com.apinexus.registry.massive.virtualrecord1232;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualRecord1232Repository extends JpaRepository<VirtualRecord1232, Long> {
    VirtualRecord1232 findByName(String name);
}

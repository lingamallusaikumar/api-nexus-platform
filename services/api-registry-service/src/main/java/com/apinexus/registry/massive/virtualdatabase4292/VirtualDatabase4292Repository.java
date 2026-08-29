package com.apinexus.registry.massive.virtualdatabase4292;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualDatabase4292Repository extends JpaRepository<VirtualDatabase4292, Long> {
    VirtualDatabase4292 findByName(String name);
}

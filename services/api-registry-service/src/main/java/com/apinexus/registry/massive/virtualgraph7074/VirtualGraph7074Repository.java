package com.apinexus.registry.massive.virtualgraph7074;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualGraph7074Repository extends JpaRepository<VirtualGraph7074, Long> {
    VirtualGraph7074 findByName(String name);
}

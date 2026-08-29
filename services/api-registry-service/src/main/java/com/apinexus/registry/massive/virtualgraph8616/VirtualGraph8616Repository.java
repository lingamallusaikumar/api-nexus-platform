package com.apinexus.registry.massive.virtualgraph8616;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualGraph8616Repository extends JpaRepository<VirtualGraph8616, Long> {
    VirtualGraph8616 findByName(String name);
}

package com.apinexus.registry.massive.edgestore3826;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeStore3826Repository extends JpaRepository<EdgeStore3826, Long> {
    EdgeStore3826 findByName(String name);
}

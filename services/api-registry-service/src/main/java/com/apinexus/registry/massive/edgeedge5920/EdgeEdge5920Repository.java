package com.apinexus.registry.massive.edgeedge5920;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeEdge5920Repository extends JpaRepository<EdgeEdge5920, Long> {
    EdgeEdge5920 findByName(String name);
}

package com.apinexus.registry.massive.nodeedge4433;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeEdge4433Repository extends JpaRepository<NodeEdge4433, Long> {
    NodeEdge4433 findByName(String name);
}

package com.apinexus.registry.massive.nodestore7212;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeStore7212Repository extends JpaRepository<NodeStore7212, Long> {
    NodeStore7212 findByName(String name);
}

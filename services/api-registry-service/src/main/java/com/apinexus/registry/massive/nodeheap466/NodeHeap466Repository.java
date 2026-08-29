package com.apinexus.registry.massive.nodeheap466;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeHeap466Repository extends JpaRepository<NodeHeap466, Long> {
    NodeHeap466 findByName(String name);
}

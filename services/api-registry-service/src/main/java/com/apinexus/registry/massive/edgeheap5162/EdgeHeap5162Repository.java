package com.apinexus.registry.massive.edgeheap5162;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeHeap5162Repository extends JpaRepository<EdgeHeap5162, Long> {
    EdgeHeap5162 findByName(String name);
}

package com.apinexus.registry.massive.batchedge6578;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchEdge6578Repository extends JpaRepository<BatchEdge6578, Long> {
    BatchEdge6578 findByName(String name);
}

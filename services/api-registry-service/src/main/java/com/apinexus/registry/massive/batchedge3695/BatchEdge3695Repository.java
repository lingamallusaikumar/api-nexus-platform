package com.apinexus.registry.massive.batchedge3695;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchEdge3695Repository extends JpaRepository<BatchEdge3695, Long> {
    BatchEdge3695 findByName(String name);
}

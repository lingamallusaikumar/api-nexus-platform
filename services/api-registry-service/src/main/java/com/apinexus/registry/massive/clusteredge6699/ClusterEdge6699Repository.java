package com.apinexus.registry.massive.clusteredge6699;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterEdge6699Repository extends JpaRepository<ClusterEdge6699, Long> {
    ClusterEdge6699 findByName(String name);
}

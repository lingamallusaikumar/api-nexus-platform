package com.apinexus.registry.massive.clusterengine187;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterEngine187Repository extends JpaRepository<ClusterEngine187, Long> {
    ClusterEngine187 findByName(String name);
}

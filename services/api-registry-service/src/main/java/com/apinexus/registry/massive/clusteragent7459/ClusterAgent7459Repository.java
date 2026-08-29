package com.apinexus.registry.massive.clusteragent7459;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterAgent7459Repository extends JpaRepository<ClusterAgent7459, Long> {
    ClusterAgent7459 findByName(String name);
}

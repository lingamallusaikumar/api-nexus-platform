package com.apinexus.registry.massive.clusterpath6400;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterPath6400Repository extends JpaRepository<ClusterPath6400, Long> {
    ClusterPath6400 findByName(String name);
}

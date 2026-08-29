package com.apinexus.registry.massive.clusteradapter3411;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterAdapter3411Repository extends JpaRepository<ClusterAdapter3411, Long> {
    ClusterAdapter3411 findByName(String name);
}

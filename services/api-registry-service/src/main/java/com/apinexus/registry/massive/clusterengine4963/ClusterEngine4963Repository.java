package com.apinexus.registry.massive.clusterengine4963;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterEngine4963Repository extends JpaRepository<ClusterEngine4963, Long> {
    ClusterEngine4963 findByName(String name);
}

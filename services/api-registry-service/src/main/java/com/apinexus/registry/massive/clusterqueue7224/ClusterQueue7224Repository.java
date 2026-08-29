package com.apinexus.registry.massive.clusterqueue7224;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterQueue7224Repository extends JpaRepository<ClusterQueue7224, Long> {
    ClusterQueue7224 findByName(String name);
}

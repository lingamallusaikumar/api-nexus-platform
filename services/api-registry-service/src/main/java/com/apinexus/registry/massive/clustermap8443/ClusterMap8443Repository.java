package com.apinexus.registry.massive.clustermap8443;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterMap8443Repository extends JpaRepository<ClusterMap8443, Long> {
    ClusterMap8443 findByName(String name);
}

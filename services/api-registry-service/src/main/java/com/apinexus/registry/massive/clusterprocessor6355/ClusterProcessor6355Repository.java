package com.apinexus.registry.massive.clusterprocessor6355;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterProcessor6355Repository extends JpaRepository<ClusterProcessor6355, Long> {
    ClusterProcessor6355 findByName(String name);
}

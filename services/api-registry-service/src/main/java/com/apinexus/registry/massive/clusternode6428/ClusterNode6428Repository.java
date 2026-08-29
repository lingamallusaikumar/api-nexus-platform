package com.apinexus.registry.massive.clusternode6428;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterNode6428Repository extends JpaRepository<ClusterNode6428, Long> {
    ClusterNode6428 findByName(String name);
}

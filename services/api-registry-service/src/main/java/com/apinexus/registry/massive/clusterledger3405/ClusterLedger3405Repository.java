package com.apinexus.registry.massive.clusterledger3405;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterLedger3405Repository extends JpaRepository<ClusterLedger3405, Long> {
    ClusterLedger3405 findByName(String name);
}

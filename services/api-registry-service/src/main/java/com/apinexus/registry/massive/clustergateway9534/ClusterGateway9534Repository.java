package com.apinexus.registry.massive.clustergateway9534;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterGateway9534Repository extends JpaRepository<ClusterGateway9534, Long> {
    ClusterGateway9534 findByName(String name);
}

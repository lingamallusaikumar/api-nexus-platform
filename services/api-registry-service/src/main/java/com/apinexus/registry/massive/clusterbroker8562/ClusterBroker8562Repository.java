package com.apinexus.registry.massive.clusterbroker8562;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterBroker8562Repository extends JpaRepository<ClusterBroker8562, Long> {
    ClusterBroker8562 findByName(String name);
}

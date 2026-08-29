package com.apinexus.registry.massive.clusterlog2505;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterLog2505Repository extends JpaRepository<ClusterLog2505, Long> {
    ClusterLog2505 findByName(String name);
}

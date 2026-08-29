package com.apinexus.registry.massive.clusterscheduler7765;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterScheduler7765Repository extends JpaRepository<ClusterScheduler7765, Long> {
    ClusterScheduler7765 findByName(String name);
}

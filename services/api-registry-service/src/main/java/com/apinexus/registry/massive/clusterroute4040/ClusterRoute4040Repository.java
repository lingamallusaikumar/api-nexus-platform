package com.apinexus.registry.massive.clusterroute4040;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterRoute4040Repository extends JpaRepository<ClusterRoute4040, Long> {
    ClusterRoute4040 findByName(String name);
}

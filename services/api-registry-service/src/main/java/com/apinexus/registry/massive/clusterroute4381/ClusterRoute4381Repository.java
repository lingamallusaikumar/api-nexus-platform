package com.apinexus.registry.massive.clusterroute4381;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterRoute4381Repository extends JpaRepository<ClusterRoute4381, Long> {
    ClusterRoute4381 findByName(String name);
}

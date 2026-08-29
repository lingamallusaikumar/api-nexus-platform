package com.apinexus.registry.massive.clustersystem2777;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterSystem2777Repository extends JpaRepository<ClusterSystem2777, Long> {
    ClusterSystem2777 findByName(String name);
}

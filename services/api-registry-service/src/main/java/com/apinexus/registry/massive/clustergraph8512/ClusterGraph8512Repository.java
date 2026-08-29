package com.apinexus.registry.massive.clustergraph8512;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterGraph8512Repository extends JpaRepository<ClusterGraph8512, Long> {
    ClusterGraph8512 findByName(String name);
}

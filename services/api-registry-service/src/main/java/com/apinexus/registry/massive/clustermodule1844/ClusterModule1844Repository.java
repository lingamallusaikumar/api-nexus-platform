package com.apinexus.registry.massive.clustermodule1844;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterModule1844Repository extends JpaRepository<ClusterModule1844, Long> {
    ClusterModule1844 findByName(String name);
}

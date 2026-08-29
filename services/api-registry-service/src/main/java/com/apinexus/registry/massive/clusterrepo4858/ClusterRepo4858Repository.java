package com.apinexus.registry.massive.clusterrepo4858;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterRepo4858Repository extends JpaRepository<ClusterRepo4858, Long> {
    ClusterRepo4858 findByName(String name);
}

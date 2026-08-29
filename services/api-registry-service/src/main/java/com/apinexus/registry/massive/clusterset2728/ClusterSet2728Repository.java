package com.apinexus.registry.massive.clusterset2728;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterSet2728Repository extends JpaRepository<ClusterSet2728, Long> {
    ClusterSet2728 findByName(String name);
}

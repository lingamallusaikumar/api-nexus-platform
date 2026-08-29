package com.apinexus.registry.massive.nodestore6622;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeStore6622Repository extends JpaRepository<NodeStore6622, Long> {
    NodeStore6622 findByName(String name);
}

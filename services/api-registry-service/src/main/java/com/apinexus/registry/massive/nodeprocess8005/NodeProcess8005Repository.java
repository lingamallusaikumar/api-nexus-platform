package com.apinexus.registry.massive.nodeprocess8005;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeProcess8005Repository extends JpaRepository<NodeProcess8005, Long> {
    NodeProcess8005 findByName(String name);
}

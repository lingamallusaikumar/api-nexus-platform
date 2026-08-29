package com.apinexus.registry.massive.edgeagent4149;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeAgent4149Repository extends JpaRepository<EdgeAgent4149, Long> {
    EdgeAgent4149 findByName(String name);
}

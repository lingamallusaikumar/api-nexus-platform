package com.apinexus.registry.massive.edgeagent6473;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeAgent6473Repository extends JpaRepository<EdgeAgent6473, Long> {
    EdgeAgent6473 findByName(String name);
}

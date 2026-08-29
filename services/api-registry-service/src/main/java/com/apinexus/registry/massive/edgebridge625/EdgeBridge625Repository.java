package com.apinexus.registry.massive.edgebridge625;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeBridge625Repository extends JpaRepository<EdgeBridge625, Long> {
    EdgeBridge625 findByName(String name);
}

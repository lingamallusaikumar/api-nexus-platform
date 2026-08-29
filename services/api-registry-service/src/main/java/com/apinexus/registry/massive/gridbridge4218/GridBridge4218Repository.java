package com.apinexus.registry.massive.gridbridge4218;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridBridge4218Repository extends JpaRepository<GridBridge4218, Long> {
    GridBridge4218 findByName(String name);
}

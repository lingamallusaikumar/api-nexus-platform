package com.apinexus.registry.massive.gridagent3033;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridAgent3033Repository extends JpaRepository<GridAgent3033, Long> {
    GridAgent3033 findByName(String name);
}

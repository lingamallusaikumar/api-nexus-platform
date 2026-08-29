package com.apinexus.registry.massive.gridscheduler3034;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridScheduler3034Repository extends JpaRepository<GridScheduler3034, Long> {
    GridScheduler3034 findByName(String name);
}

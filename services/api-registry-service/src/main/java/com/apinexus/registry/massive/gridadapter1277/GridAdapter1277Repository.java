package com.apinexus.registry.massive.gridadapter1277;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridAdapter1277Repository extends JpaRepository<GridAdapter1277, Long> {
    GridAdapter1277 findByName(String name);
}

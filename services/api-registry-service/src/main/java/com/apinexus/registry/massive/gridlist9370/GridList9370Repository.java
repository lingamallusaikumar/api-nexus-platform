package com.apinexus.registry.massive.gridlist9370;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridList9370Repository extends JpaRepository<GridList9370, Long> {
    GridList9370 findByName(String name);
}

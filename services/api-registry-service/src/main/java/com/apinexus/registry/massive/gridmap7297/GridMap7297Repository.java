package com.apinexus.registry.massive.gridmap7297;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridMap7297Repository extends JpaRepository<GridMap7297, Long> {
    GridMap7297 findByName(String name);
}

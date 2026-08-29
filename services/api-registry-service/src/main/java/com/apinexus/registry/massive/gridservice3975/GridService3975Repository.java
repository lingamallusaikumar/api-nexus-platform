package com.apinexus.registry.massive.gridservice3975;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridService3975Repository extends JpaRepository<GridService3975, Long> {
    GridService3975 findByName(String name);
}

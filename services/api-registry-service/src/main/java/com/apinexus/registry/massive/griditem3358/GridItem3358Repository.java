package com.apinexus.registry.massive.griditem3358;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridItem3358Repository extends JpaRepository<GridItem3358, Long> {
    GridItem3358 findByName(String name);
}

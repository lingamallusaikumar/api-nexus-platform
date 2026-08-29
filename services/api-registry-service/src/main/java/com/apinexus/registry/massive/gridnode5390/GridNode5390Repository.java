package com.apinexus.registry.massive.gridnode5390;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridNode5390Repository extends JpaRepository<GridNode5390, Long> {
    GridNode5390 findByName(String name);
}

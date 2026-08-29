package com.apinexus.registry.massive.gridset8696;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridSet8696Repository extends JpaRepository<GridSet8696, Long> {
    GridSet8696 findByName(String name);
}

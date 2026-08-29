package com.apinexus.registry.massive.gridthread4766;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridThread4766Repository extends JpaRepository<GridThread4766, Long> {
    GridThread4766 findByName(String name);
}

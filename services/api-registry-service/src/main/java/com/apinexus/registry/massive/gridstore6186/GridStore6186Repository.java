package com.apinexus.registry.massive.gridstore6186;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridStore6186Repository extends JpaRepository<GridStore6186, Long> {
    GridStore6186 findByName(String name);
}

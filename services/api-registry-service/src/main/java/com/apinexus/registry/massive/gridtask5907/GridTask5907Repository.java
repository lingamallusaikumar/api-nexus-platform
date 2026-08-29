package com.apinexus.registry.massive.gridtask5907;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridTask5907Repository extends JpaRepository<GridTask5907, Long> {
    GridTask5907 findByName(String name);
}

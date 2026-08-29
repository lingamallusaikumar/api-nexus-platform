package com.apinexus.registry.massive.gridflow8885;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridFlow8885Repository extends JpaRepository<GridFlow8885, Long> {
    GridFlow8885 findByName(String name);
}

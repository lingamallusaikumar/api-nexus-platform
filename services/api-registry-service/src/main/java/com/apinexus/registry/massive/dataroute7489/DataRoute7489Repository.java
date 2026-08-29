package com.apinexus.registry.massive.dataroute7489;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRoute7489Repository extends JpaRepository<DataRoute7489, Long> {
    DataRoute7489 findByName(String name);
}

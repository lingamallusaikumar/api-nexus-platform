package com.apinexus.registry.massive.edgemanager3522;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeManager3522Repository extends JpaRepository<EdgeManager3522, Long> {
    EdgeManager3522 findByName(String name);
}

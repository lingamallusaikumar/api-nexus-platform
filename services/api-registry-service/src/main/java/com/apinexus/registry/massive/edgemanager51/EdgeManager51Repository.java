package com.apinexus.registry.massive.edgemanager51;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeManager51Repository extends JpaRepository<EdgeManager51, Long> {
    EdgeManager51 findByName(String name);
}

package com.apinexus.registry.massive.edgestore9149;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeStore9149Repository extends JpaRepository<EdgeStore9149, Long> {
    EdgeStore9149 findByName(String name);
}

package com.apinexus.registry.massive.edgegraph5051;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeGraph5051Repository extends JpaRepository<EdgeGraph5051, Long> {
    EdgeGraph5051 findByName(String name);
}

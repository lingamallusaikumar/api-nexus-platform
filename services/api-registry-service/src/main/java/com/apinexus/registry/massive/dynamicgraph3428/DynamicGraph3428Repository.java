package com.apinexus.registry.massive.dynamicgraph3428;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicGraph3428Repository extends JpaRepository<DynamicGraph3428, Long> {
    DynamicGraph3428 findByName(String name);
}

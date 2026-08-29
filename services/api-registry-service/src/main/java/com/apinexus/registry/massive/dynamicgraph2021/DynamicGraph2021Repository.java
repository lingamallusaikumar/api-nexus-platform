package com.apinexus.registry.massive.dynamicgraph2021;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicGraph2021Repository extends JpaRepository<DynamicGraph2021, Long> {
    DynamicGraph2021 findByName(String name);
}

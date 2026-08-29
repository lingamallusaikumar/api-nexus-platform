package com.apinexus.registry.massive.edgevertex471;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeVertex471Repository extends JpaRepository<EdgeVertex471, Long> {
    EdgeVertex471 findByName(String name);
}

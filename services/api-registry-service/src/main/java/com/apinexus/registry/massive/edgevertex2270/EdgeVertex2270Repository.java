package com.apinexus.registry.massive.edgevertex2270;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeVertex2270Repository extends JpaRepository<EdgeVertex2270, Long> {
    EdgeVertex2270 findByName(String name);
}

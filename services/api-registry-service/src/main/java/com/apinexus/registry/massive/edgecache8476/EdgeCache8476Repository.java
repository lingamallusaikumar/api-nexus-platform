package com.apinexus.registry.massive.edgecache8476;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeCache8476Repository extends JpaRepository<EdgeCache8476, Long> {
    EdgeCache8476 findByName(String name);
}

package com.apinexus.registry.massive.edgedatabase7399;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeDatabase7399Repository extends JpaRepository<EdgeDatabase7399, Long> {
    EdgeDatabase7399 findByName(String name);
}

package com.apinexus.registry.massive.edgelink179;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeLink179Repository extends JpaRepository<EdgeLink179, Long> {
    EdgeLink179 findByName(String name);
}

package com.apinexus.registry.massive.edgequeue4267;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeQueue4267Repository extends JpaRepository<EdgeQueue4267, Long> {
    EdgeQueue4267 findByName(String name);
}

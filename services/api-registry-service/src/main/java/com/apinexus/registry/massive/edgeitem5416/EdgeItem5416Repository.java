package com.apinexus.registry.massive.edgeitem5416;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeItem5416Repository extends JpaRepository<EdgeItem5416, Long> {
    EdgeItem5416 findByName(String name);
}

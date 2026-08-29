package com.apinexus.registry.massive.edgeset8281;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeSet8281Repository extends JpaRepository<EdgeSet8281, Long> {
    EdgeSet8281 findByName(String name);
}

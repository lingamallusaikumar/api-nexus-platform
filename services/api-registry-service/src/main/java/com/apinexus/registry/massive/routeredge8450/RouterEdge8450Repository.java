package com.apinexus.registry.massive.routeredge8450;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterEdge8450Repository extends JpaRepository<RouterEdge8450, Long> {
    RouterEdge8450 findByName(String name);
}

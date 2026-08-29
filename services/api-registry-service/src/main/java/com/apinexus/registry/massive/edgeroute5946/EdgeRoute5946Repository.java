package com.apinexus.registry.massive.edgeroute5946;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeRoute5946Repository extends JpaRepository<EdgeRoute5946, Long> {
    EdgeRoute5946 findByName(String name);
}

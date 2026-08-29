package com.apinexus.registry.massive.edgebridge6326;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeBridge6326Repository extends JpaRepository<EdgeBridge6326, Long> {
    EdgeBridge6326 findByName(String name);
}

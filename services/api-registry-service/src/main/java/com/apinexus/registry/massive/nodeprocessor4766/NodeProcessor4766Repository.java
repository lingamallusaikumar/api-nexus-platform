package com.apinexus.registry.massive.nodeprocessor4766;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeProcessor4766Repository extends JpaRepository<NodeProcessor4766, Long> {
    NodeProcessor4766 findByName(String name);
}

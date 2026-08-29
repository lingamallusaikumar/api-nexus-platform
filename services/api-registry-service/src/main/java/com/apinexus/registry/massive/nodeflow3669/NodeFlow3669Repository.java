package com.apinexus.registry.massive.nodeflow3669;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeFlow3669Repository extends JpaRepository<NodeFlow3669, Long> {
    NodeFlow3669 findByName(String name);
}

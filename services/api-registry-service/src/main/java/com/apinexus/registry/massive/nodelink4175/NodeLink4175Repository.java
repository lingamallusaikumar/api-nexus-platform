package com.apinexus.registry.massive.nodelink4175;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeLink4175Repository extends JpaRepository<NodeLink4175, Long> {
    NodeLink4175 findByName(String name);
}

package com.apinexus.registry.massive.nodelink3029;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeLink3029Repository extends JpaRepository<NodeLink3029, Long> {
    NodeLink3029 findByName(String name);
}

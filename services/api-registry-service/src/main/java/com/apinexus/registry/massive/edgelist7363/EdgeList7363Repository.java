package com.apinexus.registry.massive.edgelist7363;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeList7363Repository extends JpaRepository<EdgeList7363, Long> {
    EdgeList7363 findByName(String name);
}

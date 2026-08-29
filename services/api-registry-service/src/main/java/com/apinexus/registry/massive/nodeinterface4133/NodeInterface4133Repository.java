package com.apinexus.registry.massive.nodeinterface4133;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeInterface4133Repository extends JpaRepository<NodeInterface4133, Long> {
    NodeInterface4133 findByName(String name);
}

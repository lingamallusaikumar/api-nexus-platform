package com.apinexus.registry.massive.nodepool9737;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodePool9737Repository extends JpaRepository<NodePool9737, Long> {
    NodePool9737 findByName(String name);
}

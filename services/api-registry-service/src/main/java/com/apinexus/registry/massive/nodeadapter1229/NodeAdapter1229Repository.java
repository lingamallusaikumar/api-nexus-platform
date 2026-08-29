package com.apinexus.registry.massive.nodeadapter1229;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeAdapter1229Repository extends JpaRepository<NodeAdapter1229, Long> {
    NodeAdapter1229 findByName(String name);
}

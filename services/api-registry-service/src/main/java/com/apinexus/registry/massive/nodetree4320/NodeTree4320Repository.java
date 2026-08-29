package com.apinexus.registry.massive.nodetree4320;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeTree4320Repository extends JpaRepository<NodeTree4320, Long> {
    NodeTree4320 findByName(String name);
}

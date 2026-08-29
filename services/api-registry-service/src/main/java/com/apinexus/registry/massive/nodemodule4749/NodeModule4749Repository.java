package com.apinexus.registry.massive.nodemodule4749;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeModule4749Repository extends JpaRepository<NodeModule4749, Long> {
    NodeModule4749 findByName(String name);
}

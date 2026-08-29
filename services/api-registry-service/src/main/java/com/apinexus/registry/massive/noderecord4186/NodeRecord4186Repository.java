package com.apinexus.registry.massive.noderecord4186;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRecord4186Repository extends JpaRepository<NodeRecord4186, Long> {
    NodeRecord4186 findByName(String name);
}

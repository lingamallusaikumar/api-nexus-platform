package com.apinexus.registry.massive.nodegateway561;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeGateway561Repository extends JpaRepository<NodeGateway561, Long> {
    NodeGateway561 findByName(String name);
}

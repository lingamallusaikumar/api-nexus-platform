package com.apinexus.registry.massive.nodegateway6209;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeGateway6209Repository extends JpaRepository<NodeGateway6209, Long> {
    NodeGateway6209 findByName(String name);
}

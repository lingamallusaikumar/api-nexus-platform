package com.apinexus.registry.massive.networkedge5457;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkEdge5457Repository extends JpaRepository<NetworkEdge5457, Long> {
    NetworkEdge5457 findByName(String name);
}

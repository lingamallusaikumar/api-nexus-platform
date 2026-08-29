package com.apinexus.registry.massive.nodeportal6134;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodePortal6134Repository extends JpaRepository<NodePortal6134, Long> {
    NodePortal6134 findByName(String name);
}

package com.apinexus.registry.massive.nodeengine5686;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeEngine5686Repository extends JpaRepository<NodeEngine5686, Long> {
    NodeEngine5686 findByName(String name);
}

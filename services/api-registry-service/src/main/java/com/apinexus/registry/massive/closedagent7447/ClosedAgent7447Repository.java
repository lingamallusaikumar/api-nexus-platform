package com.apinexus.registry.massive.closedagent7447;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedAgent7447Repository extends JpaRepository<ClosedAgent7447, Long> {
    ClosedAgent7447 findByName(String name);
}

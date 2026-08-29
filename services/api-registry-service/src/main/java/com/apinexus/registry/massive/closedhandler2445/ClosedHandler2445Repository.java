package com.apinexus.registry.massive.closedhandler2445;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedHandler2445Repository extends JpaRepository<ClosedHandler2445, Long> {
    ClosedHandler2445 findByName(String name);
}

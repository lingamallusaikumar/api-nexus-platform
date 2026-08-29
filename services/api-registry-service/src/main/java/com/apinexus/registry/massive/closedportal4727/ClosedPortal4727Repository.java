package com.apinexus.registry.massive.closedportal4727;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedPortal4727Repository extends JpaRepository<ClosedPortal4727, Long> {
    ClosedPortal4727 findByName(String name);
}

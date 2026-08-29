package com.apinexus.registry.massive.closedpath6234;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedPath6234Repository extends JpaRepository<ClosedPath6234, Long> {
    ClosedPath6234 findByName(String name);
}

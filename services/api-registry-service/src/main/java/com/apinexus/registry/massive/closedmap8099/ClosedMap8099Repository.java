package com.apinexus.registry.massive.closedmap8099;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedMap8099Repository extends JpaRepository<ClosedMap8099, Long> {
    ClosedMap8099 findByName(String name);
}

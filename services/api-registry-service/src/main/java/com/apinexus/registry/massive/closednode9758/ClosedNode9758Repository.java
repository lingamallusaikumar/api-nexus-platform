package com.apinexus.registry.massive.closednode9758;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedNode9758Repository extends JpaRepository<ClosedNode9758, Long> {
    ClosedNode9758 findByName(String name);
}

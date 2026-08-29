package com.apinexus.registry.massive.closedrepo9076;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedRepo9076Repository extends JpaRepository<ClosedRepo9076, Long> {
    ClosedRepo9076 findByName(String name);
}

package com.apinexus.registry.massive.closedrepo8309;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedRepo8309Repository extends JpaRepository<ClosedRepo8309, Long> {
    ClosedRepo8309 findByName(String name);
}

package com.apinexus.registry.massive.gridledger1073;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridLedger1073Repository extends JpaRepository<GridLedger1073, Long> {
    GridLedger1073 findByName(String name);
}

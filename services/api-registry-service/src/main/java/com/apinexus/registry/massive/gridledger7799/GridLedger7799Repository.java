package com.apinexus.registry.massive.gridledger7799;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridLedger7799Repository extends JpaRepository<GridLedger7799, Long> {
    GridLedger7799 findByName(String name);
}

package com.apinexus.registry.massive.edgeledger9203;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeLedger9203Repository extends JpaRepository<EdgeLedger9203, Long> {
    EdgeLedger9203 findByName(String name);
}

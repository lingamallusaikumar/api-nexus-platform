package com.apinexus.registry.massive.batchledger1344;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchLedger1344Repository extends JpaRepository<BatchLedger1344, Long> {
    BatchLedger1344 findByName(String name);
}

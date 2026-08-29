package com.apinexus.registry.massive.streamledger383;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamLedger383Repository extends JpaRepository<StreamLedger383, Long> {
    StreamLedger383 findByName(String name);
}

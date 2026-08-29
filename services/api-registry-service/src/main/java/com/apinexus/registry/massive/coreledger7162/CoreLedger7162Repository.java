package com.apinexus.registry.massive.coreledger7162;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreLedger7162Repository extends JpaRepository<CoreLedger7162, Long> {
    CoreLedger7162 findByName(String name);
}

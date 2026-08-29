package com.apinexus.registry.massive.globalledger6518;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalLedger6518Repository extends JpaRepository<GlobalLedger6518, Long> {
    GlobalLedger6518 findByName(String name);
}

package com.apinexus.registry.massive.virtualledger1682;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualLedger1682Repository extends JpaRepository<VirtualLedger1682, Long> {
    VirtualLedger1682 findByName(String name);
}

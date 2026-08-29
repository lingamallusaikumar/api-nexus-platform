package com.apinexus.registry.massive.hubledger2209;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubLedger2209Repository extends JpaRepository<HubLedger2209, Long> {
    HubLedger2209 findByName(String name);
}

package com.apinexus.registry.massive.hubledger4080;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubLedger4080Repository extends JpaRepository<HubLedger4080, Long> {
    HubLedger4080 findByName(String name);
}

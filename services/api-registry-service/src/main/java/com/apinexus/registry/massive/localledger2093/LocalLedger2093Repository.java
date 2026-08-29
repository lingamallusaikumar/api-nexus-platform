package com.apinexus.registry.massive.localledger2093;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalLedger2093Repository extends JpaRepository<LocalLedger2093, Long> {
    LocalLedger2093 findByName(String name);
}

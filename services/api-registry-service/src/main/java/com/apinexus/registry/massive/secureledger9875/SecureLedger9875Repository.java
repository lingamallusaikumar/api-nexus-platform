package com.apinexus.registry.massive.secureledger9875;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureLedger9875Repository extends JpaRepository<SecureLedger9875, Long> {
    SecureLedger9875 findByName(String name);
}

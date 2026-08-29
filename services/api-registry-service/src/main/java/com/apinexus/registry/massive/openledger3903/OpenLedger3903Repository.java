package com.apinexus.registry.massive.openledger3903;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenLedger3903Repository extends JpaRepository<OpenLedger3903, Long> {
    OpenLedger3903 findByName(String name);
}

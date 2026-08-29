package com.apinexus.registry.massive.meshledger4804;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeshLedger4804Repository extends JpaRepository<MeshLedger4804, Long> {
    MeshLedger4804 findByName(String name);
}

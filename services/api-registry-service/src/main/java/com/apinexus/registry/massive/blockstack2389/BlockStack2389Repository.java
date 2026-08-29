package com.apinexus.registry.massive.blockstack2389;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockStack2389Repository extends JpaRepository<BlockStack2389, Long> {
    BlockStack2389 findByName(String name);
}

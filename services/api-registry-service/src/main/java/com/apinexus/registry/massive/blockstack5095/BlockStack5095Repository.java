package com.apinexus.registry.massive.blockstack5095;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockStack5095Repository extends JpaRepository<BlockStack5095, Long> {
    BlockStack5095 findByName(String name);
}

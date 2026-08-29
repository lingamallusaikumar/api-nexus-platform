package com.apinexus.registry.massive.blockbridge8958;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockBridge8958Repository extends JpaRepository<BlockBridge8958, Long> {
    BlockBridge8958 findByName(String name);
}

package com.apinexus.registry.massive.blockinterface1297;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockInterface1297Repository extends JpaRepository<BlockInterface1297, Long> {
    BlockInterface1297 findByName(String name);
}

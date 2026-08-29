package com.apinexus.registry.massive.blocklog2239;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockLog2239Repository extends JpaRepository<BlockLog2239, Long> {
    BlockLog2239 findByName(String name);
}

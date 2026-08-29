package com.apinexus.registry.massive.blockmap8240;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockMap8240Repository extends JpaRepository<BlockMap8240, Long> {
    BlockMap8240 findByName(String name);
}

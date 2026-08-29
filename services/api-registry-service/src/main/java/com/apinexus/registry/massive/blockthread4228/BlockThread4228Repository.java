package com.apinexus.registry.massive.blockthread4228;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockThread4228Repository extends JpaRepository<BlockThread4228, Long> {
    BlockThread4228 findByName(String name);
}

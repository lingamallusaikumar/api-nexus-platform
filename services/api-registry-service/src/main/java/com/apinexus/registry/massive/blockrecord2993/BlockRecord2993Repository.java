package com.apinexus.registry.massive.blockrecord2993;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRecord2993Repository extends JpaRepository<BlockRecord2993, Long> {
    BlockRecord2993 findByName(String name);
}

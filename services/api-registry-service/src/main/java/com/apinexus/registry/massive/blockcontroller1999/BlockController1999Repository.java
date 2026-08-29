package com.apinexus.registry.massive.blockcontroller1999;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockController1999Repository extends JpaRepository<BlockController1999, Long> {
    BlockController1999 findByName(String name);
}

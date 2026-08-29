package com.apinexus.registry.massive.blockmap8964;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockMap8964Repository extends JpaRepository<BlockMap8964, Long> {
    BlockMap8964 findByName(String name);
}

package com.apinexus.registry.massive.blockmap5567;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockMap5567Repository extends JpaRepository<BlockMap5567, Long> {
    BlockMap5567 findByName(String name);
}

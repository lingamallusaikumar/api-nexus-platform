package com.apinexus.registry.massive.blockpath3512;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockPath3512Repository extends JpaRepository<BlockPath3512, Long> {
    BlockPath3512 findByName(String name);
}

package com.apinexus.registry.massive.blocklog5064;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockLog5064Repository extends JpaRepository<BlockLog5064, Long> {
    BlockLog5064 findByName(String name);
}

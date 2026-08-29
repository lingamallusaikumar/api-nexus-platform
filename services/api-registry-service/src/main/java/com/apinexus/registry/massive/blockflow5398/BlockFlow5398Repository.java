package com.apinexus.registry.massive.blockflow5398;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockFlow5398Repository extends JpaRepository<BlockFlow5398, Long> {
    BlockFlow5398 findByName(String name);
}

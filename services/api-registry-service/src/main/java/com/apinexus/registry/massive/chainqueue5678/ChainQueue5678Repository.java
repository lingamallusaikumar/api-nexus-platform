package com.apinexus.registry.massive.chainqueue5678;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainQueue5678Repository extends JpaRepository<ChainQueue5678, Long> {
    ChainQueue5678 findByName(String name);
}

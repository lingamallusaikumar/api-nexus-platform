package com.apinexus.registry.massive.chainnode8496;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainNode8496Repository extends JpaRepository<ChainNode8496, Long> {
    ChainNode8496 findByName(String name);
}

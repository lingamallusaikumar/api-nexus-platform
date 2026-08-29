package com.apinexus.registry.massive.chainnode2120;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainNode2120Repository extends JpaRepository<ChainNode2120, Long> {
    ChainNode2120 findByName(String name);
}

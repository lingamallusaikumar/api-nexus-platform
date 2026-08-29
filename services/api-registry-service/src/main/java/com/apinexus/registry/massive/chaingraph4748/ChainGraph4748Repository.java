package com.apinexus.registry.massive.chaingraph4748;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainGraph4748Repository extends JpaRepository<ChainGraph4748, Long> {
    ChainGraph4748 findByName(String name);
}

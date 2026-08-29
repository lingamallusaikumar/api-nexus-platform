package com.apinexus.registry.massive.chainsystem8815;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainSystem8815Repository extends JpaRepository<ChainSystem8815, Long> {
    ChainSystem8815 findByName(String name);
}

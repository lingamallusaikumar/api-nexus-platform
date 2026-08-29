package com.apinexus.registry.massive.chainvertex6977;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainVertex6977Repository extends JpaRepository<ChainVertex6977, Long> {
    ChainVertex6977 findByName(String name);
}

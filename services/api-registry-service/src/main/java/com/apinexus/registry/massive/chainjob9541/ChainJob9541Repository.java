package com.apinexus.registry.massive.chainjob9541;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChainJob9541Repository extends JpaRepository<ChainJob9541, Long> {
    ChainJob9541 findByName(String name);
}

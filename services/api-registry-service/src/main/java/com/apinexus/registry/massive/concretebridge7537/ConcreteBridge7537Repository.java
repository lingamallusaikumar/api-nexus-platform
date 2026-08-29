package com.apinexus.registry.massive.concretebridge7537;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteBridge7537Repository extends JpaRepository<ConcreteBridge7537, Long> {
    ConcreteBridge7537 findByName(String name);
}

package com.apinexus.registry.massive.concretevertex6459;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteVertex6459Repository extends JpaRepository<ConcreteVertex6459, Long> {
    ConcreteVertex6459 findByName(String name);
}

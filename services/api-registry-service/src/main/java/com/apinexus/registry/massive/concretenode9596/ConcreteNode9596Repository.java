package com.apinexus.registry.massive.concretenode9596;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteNode9596Repository extends JpaRepository<ConcreteNode9596, Long> {
    ConcreteNode9596 findByName(String name);
}

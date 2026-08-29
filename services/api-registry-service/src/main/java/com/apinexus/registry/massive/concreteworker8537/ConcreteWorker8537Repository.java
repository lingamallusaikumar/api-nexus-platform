package com.apinexus.registry.massive.concreteworker8537;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteWorker8537Repository extends JpaRepository<ConcreteWorker8537, Long> {
    ConcreteWorker8537 findByName(String name);
}

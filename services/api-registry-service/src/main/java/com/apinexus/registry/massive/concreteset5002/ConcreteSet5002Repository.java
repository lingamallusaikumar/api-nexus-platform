package com.apinexus.registry.massive.concreteset5002;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteSet5002Repository extends JpaRepository<ConcreteSet5002, Long> {
    ConcreteSet5002 findByName(String name);
}

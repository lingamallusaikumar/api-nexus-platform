package com.apinexus.registry.massive.concreteagent3038;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteAgent3038Repository extends JpaRepository<ConcreteAgent3038, Long> {
    ConcreteAgent3038 findByName(String name);
}

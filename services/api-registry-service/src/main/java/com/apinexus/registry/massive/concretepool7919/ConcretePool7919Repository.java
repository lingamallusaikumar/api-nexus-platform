package com.apinexus.registry.massive.concretepool7919;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcretePool7919Repository extends JpaRepository<ConcretePool7919, Long> {
    ConcretePool7919 findByName(String name);
}

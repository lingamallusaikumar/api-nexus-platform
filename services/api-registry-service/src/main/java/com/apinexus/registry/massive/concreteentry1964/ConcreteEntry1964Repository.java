package com.apinexus.registry.massive.concreteentry1964;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteEntry1964Repository extends JpaRepository<ConcreteEntry1964, Long> {
    ConcreteEntry1964 findByName(String name);
}

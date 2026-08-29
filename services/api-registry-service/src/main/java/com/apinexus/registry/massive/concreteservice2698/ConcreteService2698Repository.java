package com.apinexus.registry.massive.concreteservice2698;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteService2698Repository extends JpaRepository<ConcreteService2698, Long> {
    ConcreteService2698 findByName(String name);
}

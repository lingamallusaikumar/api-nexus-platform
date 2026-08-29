package com.apinexus.registry.massive.concreteitem4995;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteItem4995Repository extends JpaRepository<ConcreteItem4995, Long> {
    ConcreteItem4995 findByName(String name);
}

package com.apinexus.registry.massive.concreteportal8408;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcretePortal8408Repository extends JpaRepository<ConcretePortal8408, Long> {
    ConcretePortal8408 findByName(String name);
}

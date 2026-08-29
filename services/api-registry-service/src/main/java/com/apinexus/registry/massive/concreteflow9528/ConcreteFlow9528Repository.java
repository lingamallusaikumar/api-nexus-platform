package com.apinexus.registry.massive.concreteflow9528;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteFlow9528Repository extends JpaRepository<ConcreteFlow9528, Long> {
    ConcreteFlow9528 findByName(String name);
}

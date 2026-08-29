package com.apinexus.registry.massive.concretequeue4473;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcreteQueue4473Repository extends JpaRepository<ConcreteQueue4473, Long> {
    ConcreteQueue4473 findByName(String name);
}

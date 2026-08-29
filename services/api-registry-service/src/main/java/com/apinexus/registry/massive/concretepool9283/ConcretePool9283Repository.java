package com.apinexus.registry.massive.concretepool9283;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcretePool9283Repository extends JpaRepository<ConcretePool9283, Long> {
    ConcretePool9283 findByName(String name);
}

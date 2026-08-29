package com.apinexus.registry.massive.abstractsystem2207;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractSystem2207Repository extends JpaRepository<AbstractSystem2207, Long> {
    AbstractSystem2207 findByName(String name);
}

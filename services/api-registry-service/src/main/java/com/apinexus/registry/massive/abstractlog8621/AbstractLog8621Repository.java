package com.apinexus.registry.massive.abstractlog8621;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractLog8621Repository extends JpaRepository<AbstractLog8621, Long> {
    AbstractLog8621 findByName(String name);
}

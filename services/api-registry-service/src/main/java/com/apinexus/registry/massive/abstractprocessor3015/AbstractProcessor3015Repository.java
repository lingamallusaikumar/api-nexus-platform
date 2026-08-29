package com.apinexus.registry.massive.abstractprocessor3015;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractProcessor3015Repository extends JpaRepository<AbstractProcessor3015, Long> {
    AbstractProcessor3015 findByName(String name);
}

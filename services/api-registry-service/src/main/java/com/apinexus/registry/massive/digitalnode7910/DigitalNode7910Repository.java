package com.apinexus.registry.massive.digitalnode7910;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalNode7910Repository extends JpaRepository<DigitalNode7910, Long> {
    DigitalNode7910 findByName(String name);
}

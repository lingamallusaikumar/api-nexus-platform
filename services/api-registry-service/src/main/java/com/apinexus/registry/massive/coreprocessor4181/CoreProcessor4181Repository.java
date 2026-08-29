package com.apinexus.registry.massive.coreprocessor4181;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreProcessor4181Repository extends JpaRepository<CoreProcessor4181, Long> {
    CoreProcessor4181 findByName(String name);
}

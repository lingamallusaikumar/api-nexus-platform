package com.apinexus.registry.massive.coreprocessor241;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreProcessor241Repository extends JpaRepository<CoreProcessor241, Long> {
    CoreProcessor241 findByName(String name);
}

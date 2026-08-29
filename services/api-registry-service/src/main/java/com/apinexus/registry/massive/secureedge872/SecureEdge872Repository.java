package com.apinexus.registry.massive.secureedge872;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureEdge872Repository extends JpaRepository<SecureEdge872, Long> {
    SecureEdge872 findByName(String name);
}

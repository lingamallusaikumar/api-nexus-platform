package com.apinexus.registry.massive.secureedge4865;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureEdge4865Repository extends JpaRepository<SecureEdge4865, Long> {
    SecureEdge4865 findByName(String name);
}

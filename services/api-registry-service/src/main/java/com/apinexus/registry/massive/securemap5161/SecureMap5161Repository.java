package com.apinexus.registry.massive.securemap5161;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureMap5161Repository extends JpaRepository<SecureMap5161, Long> {
    SecureMap5161 findByName(String name);
}

package com.apinexus.registry.massive.securearray8613;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureArray8613Repository extends JpaRepository<SecureArray8613, Long> {
    SecureArray8613 findByName(String name);
}

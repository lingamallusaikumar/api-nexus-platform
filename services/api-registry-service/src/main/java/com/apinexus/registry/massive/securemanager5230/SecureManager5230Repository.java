package com.apinexus.registry.massive.securemanager5230;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureManager5230Repository extends JpaRepository<SecureManager5230, Long> {
    SecureManager5230 findByName(String name);
}

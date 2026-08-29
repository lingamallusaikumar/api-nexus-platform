package com.apinexus.registry.massive.securearray3374;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureArray3374Repository extends JpaRepository<SecureArray3374, Long> {
    SecureArray3374 findByName(String name);
}

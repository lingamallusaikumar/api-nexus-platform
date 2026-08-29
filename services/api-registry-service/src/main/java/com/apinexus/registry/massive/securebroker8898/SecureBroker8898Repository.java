package com.apinexus.registry.massive.securebroker8898;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureBroker8898Repository extends JpaRepository<SecureBroker8898, Long> {
    SecureBroker8898 findByName(String name);
}

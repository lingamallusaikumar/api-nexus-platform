package com.apinexus.registry.massive.secureprocess5474;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureProcess5474Repository extends JpaRepository<SecureProcess5474, Long> {
    SecureProcess5474 findByName(String name);
}

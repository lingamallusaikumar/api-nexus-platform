package com.apinexus.registry.massive.secureentry103;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureEntry103Repository extends JpaRepository<SecureEntry103, Long> {
    SecureEntry103 findByName(String name);
}

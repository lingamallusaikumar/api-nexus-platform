package com.apinexus.registry.massive.securebridge876;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureBridge876Repository extends JpaRepository<SecureBridge876, Long> {
    SecureBridge876 findByName(String name);
}

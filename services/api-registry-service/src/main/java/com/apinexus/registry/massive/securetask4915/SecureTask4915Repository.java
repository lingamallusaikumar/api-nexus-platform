package com.apinexus.registry.massive.securetask4915;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureTask4915Repository extends JpaRepository<SecureTask4915, Long> {
    SecureTask4915 findByName(String name);
}

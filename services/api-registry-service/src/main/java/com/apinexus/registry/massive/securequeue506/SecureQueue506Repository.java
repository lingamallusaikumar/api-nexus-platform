package com.apinexus.registry.massive.securequeue506;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureQueue506Repository extends JpaRepository<SecureQueue506, Long> {
    SecureQueue506 findByName(String name);
}

package com.apinexus.registry.massive.securecomponent4239;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureComponent4239Repository extends JpaRepository<SecureComponent4239, Long> {
    SecureComponent4239 findByName(String name);
}

package com.apinexus.registry.massive.securegateway6053;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureGateway6053Repository extends JpaRepository<SecureGateway6053, Long> {
    SecureGateway6053 findByName(String name);
}

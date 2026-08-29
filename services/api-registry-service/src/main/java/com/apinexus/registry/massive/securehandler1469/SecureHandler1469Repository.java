package com.apinexus.registry.massive.securehandler1469;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureHandler1469Repository extends JpaRepository<SecureHandler1469, Long> {
    SecureHandler1469 findByName(String name);
}

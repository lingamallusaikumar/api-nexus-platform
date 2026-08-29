package com.apinexus.registry.massive.securescheduler8263;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureScheduler8263Repository extends JpaRepository<SecureScheduler8263, Long> {
    SecureScheduler8263 findByName(String name);
}

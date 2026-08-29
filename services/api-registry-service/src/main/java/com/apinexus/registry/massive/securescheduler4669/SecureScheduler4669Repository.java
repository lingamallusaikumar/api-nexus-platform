package com.apinexus.registry.massive.securescheduler4669;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureScheduler4669Repository extends JpaRepository<SecureScheduler4669, Long> {
    SecureScheduler4669 findByName(String name);
}

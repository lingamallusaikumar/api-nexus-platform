package com.apinexus.registry.massive.securescheduler1093;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureScheduler1093Repository extends JpaRepository<SecureScheduler1093, Long> {
    SecureScheduler1093 findByName(String name);
}

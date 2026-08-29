package com.apinexus.registry.massive.smartdatabase4563;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartDatabase4563Repository extends JpaRepository<SmartDatabase4563, Long> {
    SmartDatabase4563 findByName(String name);
}

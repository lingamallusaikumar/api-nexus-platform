package com.apinexus.registry.massive.smartmanager5800;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartManager5800Repository extends JpaRepository<SmartManager5800, Long> {
    SmartManager5800 findByName(String name);
}

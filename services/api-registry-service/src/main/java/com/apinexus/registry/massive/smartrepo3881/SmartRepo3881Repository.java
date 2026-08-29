package com.apinexus.registry.massive.smartrepo3881;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartRepo3881Repository extends JpaRepository<SmartRepo3881, Long> {
    SmartRepo3881 findByName(String name);
}

package com.apinexus.registry.massive.syncbridge8486;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncBridge8486Repository extends JpaRepository<SyncBridge8486, Long> {
    SyncBridge8486 findByName(String name);
}

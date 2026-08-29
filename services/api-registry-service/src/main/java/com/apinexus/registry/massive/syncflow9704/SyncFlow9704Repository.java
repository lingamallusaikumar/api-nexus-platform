package com.apinexus.registry.massive.syncflow9704;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncFlow9704Repository extends JpaRepository<SyncFlow9704, Long> {
    SyncFlow9704 findByName(String name);
}

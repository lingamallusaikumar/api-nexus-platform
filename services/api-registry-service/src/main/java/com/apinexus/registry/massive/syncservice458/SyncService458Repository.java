package com.apinexus.registry.massive.syncservice458;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncService458Repository extends JpaRepository<SyncService458, Long> {
    SyncService458 findByName(String name);
}

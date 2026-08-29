package com.apinexus.registry.massive.syncjob9374;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncJob9374Repository extends JpaRepository<SyncJob9374, Long> {
    SyncJob9374 findByName(String name);
}

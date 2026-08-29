package com.apinexus.registry.massive.syncgraph8009;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncGraph8009Repository extends JpaRepository<SyncGraph8009, Long> {
    SyncGraph8009 findByName(String name);
}

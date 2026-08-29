package com.apinexus.registry.massive.syncgraph4499;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncGraph4499Repository extends JpaRepository<SyncGraph4499, Long> {
    SyncGraph4499 findByName(String name);
}

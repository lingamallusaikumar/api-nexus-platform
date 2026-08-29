package com.apinexus.registry.massive.syncset4582;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncSet4582Repository extends JpaRepository<SyncSet4582, Long> {
    SyncSet4582 findByName(String name);
}

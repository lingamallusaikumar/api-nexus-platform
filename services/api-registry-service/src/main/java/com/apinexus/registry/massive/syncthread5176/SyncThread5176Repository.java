package com.apinexus.registry.massive.syncthread5176;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncThread5176Repository extends JpaRepository<SyncThread5176, Long> {
    SyncThread5176 findByName(String name);
}

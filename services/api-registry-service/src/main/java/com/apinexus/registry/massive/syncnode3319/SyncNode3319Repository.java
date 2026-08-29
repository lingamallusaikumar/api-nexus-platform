package com.apinexus.registry.massive.syncnode3319;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncNode3319Repository extends JpaRepository<SyncNode3319, Long> {
    SyncNode3319 findByName(String name);
}

package com.apinexus.registry.massive.syncbuffer7490;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncBuffer7490Repository extends JpaRepository<SyncBuffer7490, Long> {
    SyncBuffer7490 findByName(String name);
}

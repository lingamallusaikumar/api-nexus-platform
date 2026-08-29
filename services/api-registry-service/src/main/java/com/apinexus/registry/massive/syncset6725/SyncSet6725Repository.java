package com.apinexus.registry.massive.syncset6725;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncSet6725Repository extends JpaRepository<SyncSet6725, Long> {
    SyncSet6725 findByName(String name);
}

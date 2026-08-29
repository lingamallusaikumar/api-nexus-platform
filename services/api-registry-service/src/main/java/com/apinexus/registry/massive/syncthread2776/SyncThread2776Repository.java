package com.apinexus.registry.massive.syncthread2776;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncThread2776Repository extends JpaRepository<SyncThread2776, Long> {
    SyncThread2776 findByName(String name);
}

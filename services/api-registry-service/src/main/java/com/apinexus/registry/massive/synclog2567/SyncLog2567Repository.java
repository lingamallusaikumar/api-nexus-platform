package com.apinexus.registry.massive.synclog2567;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncLog2567Repository extends JpaRepository<SyncLog2567, Long> {
    SyncLog2567 findByName(String name);
}

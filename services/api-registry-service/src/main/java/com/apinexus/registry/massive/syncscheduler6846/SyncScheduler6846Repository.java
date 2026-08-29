package com.apinexus.registry.massive.syncscheduler6846;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncScheduler6846Repository extends JpaRepository<SyncScheduler6846, Long> {
    SyncScheduler6846 findByName(String name);
}

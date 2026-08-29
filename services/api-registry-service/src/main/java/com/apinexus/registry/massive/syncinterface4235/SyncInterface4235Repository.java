package com.apinexus.registry.massive.syncinterface4235;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncInterface4235Repository extends JpaRepository<SyncInterface4235, Long> {
    SyncInterface4235 findByName(String name);
}

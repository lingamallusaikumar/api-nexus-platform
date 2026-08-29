package com.apinexus.registry.massive.syncportal1683;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncPortal1683Repository extends JpaRepository<SyncPortal1683, Long> {
    SyncPortal1683 findByName(String name);
}

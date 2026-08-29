package com.apinexus.registry.massive.syncgateway8179;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncGateway8179Repository extends JpaRepository<SyncGateway8179, Long> {
    SyncGateway8179 findByName(String name);
}

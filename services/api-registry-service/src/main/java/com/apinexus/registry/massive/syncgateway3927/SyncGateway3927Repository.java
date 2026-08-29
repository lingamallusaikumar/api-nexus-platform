package com.apinexus.registry.massive.syncgateway3927;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncGateway3927Repository extends JpaRepository<SyncGateway3927, Long> {
    SyncGateway3927 findByName(String name);
}

package com.apinexus.registry.massive.remoterecord1457;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteRecord1457Repository extends JpaRepository<RemoteRecord1457, Long> {
    RemoteRecord1457 findByName(String name);
}

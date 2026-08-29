package com.apinexus.registry.massive.remoteadapter2350;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteAdapter2350Repository extends JpaRepository<RemoteAdapter2350, Long> {
    RemoteAdapter2350 findByName(String name);
}

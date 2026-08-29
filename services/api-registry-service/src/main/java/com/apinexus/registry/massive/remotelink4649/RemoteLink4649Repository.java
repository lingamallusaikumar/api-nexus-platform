package com.apinexus.registry.massive.remotelink4649;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteLink4649Repository extends JpaRepository<RemoteLink4649, Long> {
    RemoteLink4649 findByName(String name);
}

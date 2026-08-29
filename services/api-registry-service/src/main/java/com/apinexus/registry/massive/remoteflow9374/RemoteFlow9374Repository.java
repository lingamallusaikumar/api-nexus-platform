package com.apinexus.registry.massive.remoteflow9374;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteFlow9374Repository extends JpaRepository<RemoteFlow9374, Long> {
    RemoteFlow9374 findByName(String name);
}

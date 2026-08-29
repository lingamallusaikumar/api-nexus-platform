package com.apinexus.registry.massive.remotecontroller8928;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteController8928Repository extends JpaRepository<RemoteController8928, Long> {
    RemoteController8928 findByName(String name);
}

package com.apinexus.registry.massive.remotejob3163;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteJob3163Repository extends JpaRepository<RemoteJob3163, Long> {
    RemoteJob3163 findByName(String name);
}

package com.apinexus.registry.massive.remoteentry6260;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteEntry6260Repository extends JpaRepository<RemoteEntry6260, Long> {
    RemoteEntry6260 findByName(String name);
}

package com.apinexus.registry.massive.syncrepo7437;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncRepo7437Repository extends JpaRepository<SyncRepo7437, Long> {
    SyncRepo7437 findByName(String name);
}

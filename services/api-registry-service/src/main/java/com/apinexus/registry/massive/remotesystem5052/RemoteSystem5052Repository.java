package com.apinexus.registry.massive.remotesystem5052;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteSystem5052Repository extends JpaRepository<RemoteSystem5052, Long> {
    RemoteSystem5052 findByName(String name);
}

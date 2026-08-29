package com.apinexus.registry.massive.remoterepo2034;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteRepo2034Repository extends JpaRepository<RemoteRepo2034, Long> {
    RemoteRepo2034 findByName(String name);
}

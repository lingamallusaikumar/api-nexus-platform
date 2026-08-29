package com.apinexus.registry.massive.remoteworker7647;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteWorker7647Repository extends JpaRepository<RemoteWorker7647, Long> {
    RemoteWorker7647 findByName(String name);
}

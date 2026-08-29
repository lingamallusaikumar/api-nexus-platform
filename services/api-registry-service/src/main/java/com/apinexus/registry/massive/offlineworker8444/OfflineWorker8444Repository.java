package com.apinexus.registry.massive.offlineworker8444;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineWorker8444Repository extends JpaRepository<OfflineWorker8444, Long> {
    OfflineWorker8444 findByName(String name);
}

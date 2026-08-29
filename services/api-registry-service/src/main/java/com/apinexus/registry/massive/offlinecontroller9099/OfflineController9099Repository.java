package com.apinexus.registry.massive.offlinecontroller9099;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineController9099Repository extends JpaRepository<OfflineController9099, Long> {
    OfflineController9099 findByName(String name);
}

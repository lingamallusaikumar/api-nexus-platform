package com.apinexus.registry.massive.offlineservice9696;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineService9696Repository extends JpaRepository<OfflineService9696, Long> {
    OfflineService9696 findByName(String name);
}

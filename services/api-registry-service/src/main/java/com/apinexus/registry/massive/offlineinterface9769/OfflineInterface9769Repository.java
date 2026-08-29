package com.apinexus.registry.massive.offlineinterface9769;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineInterface9769Repository extends JpaRepository<OfflineInterface9769, Long> {
    OfflineInterface9769 findByName(String name);
}

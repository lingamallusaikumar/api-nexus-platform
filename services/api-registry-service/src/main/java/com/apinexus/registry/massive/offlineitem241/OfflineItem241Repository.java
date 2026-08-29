package com.apinexus.registry.massive.offlineitem241;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineItem241Repository extends JpaRepository<OfflineItem241, Long> {
    OfflineItem241 findByName(String name);
}

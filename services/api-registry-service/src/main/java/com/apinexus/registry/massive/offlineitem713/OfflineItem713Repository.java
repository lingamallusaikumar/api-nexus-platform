package com.apinexus.registry.massive.offlineitem713;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineItem713Repository extends JpaRepository<OfflineItem713, Long> {
    OfflineItem713 findByName(String name);
}

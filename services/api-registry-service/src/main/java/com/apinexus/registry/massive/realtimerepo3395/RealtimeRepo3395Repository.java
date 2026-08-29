package com.apinexus.registry.massive.realtimerepo3395;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeRepo3395Repository extends JpaRepository<RealtimeRepo3395, Long> {
    RealtimeRepo3395 findByName(String name);
}

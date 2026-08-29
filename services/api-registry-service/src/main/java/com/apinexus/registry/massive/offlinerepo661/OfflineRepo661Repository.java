package com.apinexus.registry.massive.offlinerepo661;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineRepo661Repository extends JpaRepository<OfflineRepo661, Long> {
    OfflineRepo661 findByName(String name);
}

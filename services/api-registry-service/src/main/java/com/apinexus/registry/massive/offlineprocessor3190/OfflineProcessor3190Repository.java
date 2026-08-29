package com.apinexus.registry.massive.offlineprocessor3190;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineProcessor3190Repository extends JpaRepository<OfflineProcessor3190, Long> {
    OfflineProcessor3190 findByName(String name);
}

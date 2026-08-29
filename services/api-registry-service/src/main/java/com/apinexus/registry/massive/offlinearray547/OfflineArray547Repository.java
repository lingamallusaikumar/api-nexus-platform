package com.apinexus.registry.massive.offlinearray547;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineArray547Repository extends JpaRepository<OfflineArray547, Long> {
    OfflineArray547 findByName(String name);
}

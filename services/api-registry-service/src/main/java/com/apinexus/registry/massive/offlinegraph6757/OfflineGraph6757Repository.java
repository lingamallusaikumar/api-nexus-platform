package com.apinexus.registry.massive.offlinegraph6757;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineGraph6757Repository extends JpaRepository<OfflineGraph6757, Long> {
    OfflineGraph6757 findByName(String name);
}

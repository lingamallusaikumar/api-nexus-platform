package com.apinexus.registry.massive.offlineadapter2068;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineAdapter2068Repository extends JpaRepository<OfflineAdapter2068, Long> {
    OfflineAdapter2068 findByName(String name);
}

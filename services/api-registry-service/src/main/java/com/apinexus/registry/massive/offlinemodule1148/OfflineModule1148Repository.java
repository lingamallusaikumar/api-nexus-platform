package com.apinexus.registry.massive.offlinemodule1148;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfflineModule1148Repository extends JpaRepository<OfflineModule1148, Long> {
    OfflineModule1148 findByName(String name);
}

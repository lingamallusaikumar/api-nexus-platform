package com.apinexus.registry.massive.batchinterface3231;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchInterface3231Repository extends JpaRepository<BatchInterface3231, Long> {
    BatchInterface3231 findByName(String name);
}

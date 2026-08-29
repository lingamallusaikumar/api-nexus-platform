package com.apinexus.registry.massive.dynamicworker4205;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicWorker4205Repository extends JpaRepository<DynamicWorker4205, Long> {
    DynamicWorker4205 findByName(String name);
}

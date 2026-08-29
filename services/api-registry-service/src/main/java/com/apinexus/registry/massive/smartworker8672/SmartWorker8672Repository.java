package com.apinexus.registry.massive.smartworker8672;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartWorker8672Repository extends JpaRepository<SmartWorker8672, Long> {
    SmartWorker8672 findByName(String name);
}

package com.apinexus.registry.massive.smartworker7134;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartWorker7134Repository extends JpaRepository<SmartWorker7134, Long> {
    SmartWorker7134 findByName(String name);
}

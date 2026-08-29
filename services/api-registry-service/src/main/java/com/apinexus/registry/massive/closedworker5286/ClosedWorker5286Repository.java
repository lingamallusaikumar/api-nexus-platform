package com.apinexus.registry.massive.closedworker5286;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClosedWorker5286Repository extends JpaRepository<ClosedWorker5286, Long> {
    ClosedWorker5286 findByName(String name);
}

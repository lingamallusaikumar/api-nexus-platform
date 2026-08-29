package com.apinexus.registry.massive.blockworker2755;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockWorker2755Repository extends JpaRepository<BlockWorker2755, Long> {
    BlockWorker2755 findByName(String name);
}

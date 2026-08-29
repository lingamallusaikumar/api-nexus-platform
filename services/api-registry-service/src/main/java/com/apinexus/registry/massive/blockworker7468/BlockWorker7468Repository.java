package com.apinexus.registry.massive.blockworker7468;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockWorker7468Repository extends JpaRepository<BlockWorker7468, Long> {
    BlockWorker7468 findByName(String name);
}

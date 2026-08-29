package com.apinexus.registry.massive.blockworker1160;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockWorker1160Repository extends JpaRepository<BlockWorker1160, Long> {
    BlockWorker1160 findByName(String name);
}
